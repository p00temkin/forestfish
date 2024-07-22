package crypto.forestfish.utils;

import com.google.common.base.Joiner;

import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.*;

public class FilesUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(FilesUtils.class);

	public static void appendToFileUNIX(final String outString, final String filePath) throws Exception {
		appendToFile(outString, filePath, "\n");
	}

	public static void appendToFileWindows(final String outString, final String filePath) throws Exception {
		appendToFile(outString, filePath, "\r\n");
	}

	public static void appendToFile(final String outString, final String filePath, final String delimiter) throws Exception {
		Writer out = null;
		try {
			out = new OutputStreamWriter(new FileOutputStream(filePath, true), StandardCharsets.UTF_8);
			out.write(outString + delimiter);
			out.flush();
			out.close();
		} catch (Exception e) {
			throw e;
		} finally {
			IOUtils.closeQuietly(out);
		}
	}

	public static void writeToFileWindows(final String outString, final String filePath) throws Exception {
		writeToFile(outString, filePath, "\r\n");
	}

	public static void writeToFileUnlessExistsWindows(final String outString, final String filePath) throws Exception {
		File f = new File(filePath);
		if (!f.exists()) {
			writeToFile(outString, filePath, "\r\n");
		}
	}

	public static void writeToFileUNIX(final String outString, final String filePath) throws Exception {
		writeToFile(outString, filePath, "\n");
	}

	public static void writeToFileUnlessExistsUNIX(final String outString, final String filePath) throws Exception {
		File f = new File(filePath);
		if (!f.exists()) {
			writeToFile(outString, filePath, "\n");
		}
	}

	public static boolean writeToFileUnlessExistsUNIXReturnNewFileCreated(final String outString, final String filePath) throws Exception {
		File f = new File(filePath);
		if (!f.exists()) {
			writeToFile(outString, filePath, "\n");
			return false;
		}
		return false;
	}

	public static void writeToFile(final String outString, final String filePath, final String delimiter) throws Exception {
		Writer out = null;
		try {
			File oldFile = new File(filePath);
			if (oldFile.exists()) {
				if (oldFile.delete() == false) {
					LOGGER.warn("Unable to delete " + oldFile.getAbsolutePath());
				}
			}
			out = new OutputStreamWriter(new FileOutputStream(filePath, true), StandardCharsets.UTF_8);
			out.write(outString + delimiter);
			out.close();
		} catch (Exception e) {
			throw e;
		} finally {
			IOUtils.closeQuietly(out);
		}
	}

	public static String readStringFromFile(String filePath) {
		String returnString = null;
		BufferedReader br;
		try {
			FileInputStream fstream = new FileInputStream(filePath);
			InputStreamReader istream = new InputStreamReader(fstream, StandardCharsets.UTF_8);
			br = new BufferedReader(istream);
			returnString = br.readLine();
			br.close();
		} catch (IOException e1) {
			LOGGER.error("Exception while reading file content of: " + filePath + " exception: " + e1.getMessage());
		}
		return returnString;
	}

	public static String grabLastLineFromFile(File file) {
		RandomAccessFile fileHandler = null;
		try {
			fileHandler = new RandomAccessFile(file, "r");
			long fileLength = fileHandler.length() - 1;
			StringBuilder sb = new StringBuilder();

			for (long filePointer = fileLength; filePointer != -1; filePointer--) {
				fileHandler.seek(filePointer);
				int readByte = fileHandler.readByte();
				if (readByte == 0xA) {
					if (filePointer == fileLength) {
						continue;
					}
					break;
				} else if (readByte == 0xD) {
					if (filePointer == (fileLength - 1)) {
						continue;
					}
					break;
				}
				sb.append((char) readByte);
			}
			String lastLine = sb.reverse().toString();
			return lastLine;
		} catch (java.io.FileNotFoundException e) {
			return null;
		} catch (java.io.IOException e) {
			return null;
		} finally {
			if (fileHandler != null) {
				try {
					fileHandler.close();
				} catch (IOException e) {
					/* ignore */
				}
			}
		}
	}

	public static void deleteFile(final String filePath) {
		File hashFile = new File(filePath);
		if (hashFile.exists()) {
			if (hashFile.delete()) {
				//LOGGER.info("Deleted file " + filePath);
			} else {
				LOGGER.error("Failed to delete file " + filePath);
				LOGGER.error("Please check the permissions and restart dredd");
				SystemUtils.halt();
			}
		}
	}

	public static boolean deleteFileWithRetries(final String filePath, int nrRetriesThreshold) {
		int retryCounter = 0;
		boolean fileDeleted = false;
		while (!fileDeleted && (retryCounter<=nrRetriesThreshold)) {
			File hashFile = new File(filePath);
			if (hashFile.exists()) {
				if (hashFile.delete()) {
					LOGGER.info("Deleted file " + filePath);
					return true;
				} else {
					LOGGER.warn("Failed to delete file " + filePath);
					LOGGER.warn("Please check the permissions and restart dredd");
					retryCounter++;
				}
			} else {
				return true;
			}
		}
		return false;
	}

	public static List<String> readAllLinesFrom(String primaryPath) {

		primaryPath = StringsUtils.determineExistingFilePath(primaryPath);
		File priFile = new File(primaryPath);
		if (!priFile.exists()) {
			LOGGER.error("Fallback file does not exist at " + priFile.getAbsolutePath());
			LOGGER.error("TERMINATING... ");
			SystemUtils.halt();
		}

		final Path pth = priFile.toPath();
		if (!priFile.exists()) {
			try {
				LOGGER.error("Found no file at " + priFile.getCanonicalPath());
				SystemUtils.halt();
			} catch (IOException e) {
				LOGGER.error("IO exception while reading file: " + Arrays.toString(e.getStackTrace()));
				SystemUtils.halt();
			}
		}
		try {
			List<String> lines = Files.readAllLines(pth, StandardCharsets.UTF_8);
			return lines;
		} catch (Exception e) {
			LOGGER.error("IO exception while reading file " + primaryPath + ": " + Arrays.toString(e.getStackTrace()));
			SystemUtils.halt();
		}
		return new ArrayList<String>();
	}

	public static List<String> readAllLinesFromGZ(String primaryPath) {

		primaryPath = StringsUtils.determineExistingFilePath(primaryPath);
		File priFile = new File(primaryPath);
		if (!priFile.exists()) {
			LOGGER.error("Fallback file does not exist at " + priFile.getAbsolutePath());
			LOGGER.error("TERMINATING... ");
			SystemUtils.halt();
		}

		if (!priFile.exists()) {
			try {
				LOGGER.error("Found no file at " + priFile.getCanonicalPath());
				SystemUtils.halt();
			} catch (IOException e) {
				LOGGER.error("IO exception while reading file: " + Arrays.toString(e.getStackTrace()));
				SystemUtils.halt();
			}
		}
		try {

			BufferedReader br = null;
			GzipCompressorInputStream bzIn = null;
			InputStreamReader reader = null;
			FileInputStream in = null;
			in = new FileInputStream(priFile.getAbsolutePath());
			bzIn = new GzipCompressorInputStream(in);
			reader = new InputStreamReader(bzIn, StandardCharsets.UTF_8);
			br = new BufferedReader(reader, 33554432);
			List<String> lines = new ArrayList<String>();
			String line = "";
			while ((line = br.readLine()) != null) {
				if (line.isEmpty()) {
					br.close();
					break;
				}
				lines.add(line);
			}
			return lines;
		} catch (Exception e) {
			LOGGER.error("IO exception while reading file " + primaryPath + ": " + Arrays.toString(e.getStackTrace()));
			SystemUtils.halt();
		}
		return new ArrayList<String>();
	}

	public static List<String> readAllLinesFromNoException(String primaryPath) {

		primaryPath = StringsUtils.determineExistingFilePath(primaryPath);
		File priFile = new File(primaryPath);
		if (!priFile.exists()) {
			LOGGER.info("Fallback file does not exist at " + priFile.getAbsolutePath());
			return new ArrayList<String>();
		}

		final Path pth = priFile.toPath();
		if (!priFile.exists()) {
			try {
				LOGGER.info("Found no file at " + priFile.getCanonicalPath());
				return new ArrayList<String>();
			} catch (IOException e) {
				LOGGER.warn("IO exception while reading file: " + Arrays.toString(e.getStackTrace()));
				return new ArrayList<String>();
			}
		}
		try {
			List<String> lines = Files.readAllLines(pth, StandardCharsets.UTF_8);
			return lines;
		} catch (Exception e) {
			LOGGER.error("IO exception while reading file: " + Arrays.toString(e.getStackTrace()));
			return new ArrayList<String>();
		}
	}

	public static List<String> readRandomlyAllLinesButMaxFrom(String primaryPath, int maxReturn) {
		File priFile = new File(primaryPath);
		String secondaryPath = primaryPath.replaceFirst("/", "");
		File secFile = new File(secondaryPath);
		if (!priFile.exists()) {
			if (!secFile.exists()) {
				LOGGER.error("Fallback file does not exist at " + secFile.getAbsolutePath());
				LOGGER.error("TERMINATING... ");
				SystemUtils.halt();
			}
			priFile = secFile;
		}
		final Path pth = priFile.toPath();
		if (!priFile.exists()) {
			try {
				LOGGER.error("Found no file at " + priFile.getCanonicalPath());
				SystemUtils.halt();
			} catch (IOException e) {
				LOGGER.error("IO exception while reading file: " + Arrays.toString(e.getStackTrace()));
				SystemUtils.halt();
			}
		}
		try {
			List<String> lines = Files.readAllLines(pth, StandardCharsets.UTF_8);

			long seed = System.nanoTime();
			Collections.shuffle(lines, new Random(seed));

			ArrayList<String> result = new ArrayList<>();
			int counter = 0;
			for (String l: lines) {
				if (counter < maxReturn) {
					result.add(l);
				}
				counter++;
			}

			return result;
		} catch (Exception e) {
			LOGGER.error("IO exception while reading file: " + Arrays.toString(e.getStackTrace()));
			SystemUtils.halt();
		}
		return new ArrayList<>();
	}

	public static String readAllFromFileWithPath(String primaryPath) {
		File priFile = new File(primaryPath);
		final Path pth = priFile.toPath();
		if (!priFile.exists()) {
			try {
				LOGGER.error("Found no file at " + priFile.getCanonicalPath());
				SystemUtils.halt();
			} catch (IOException e) {
				LOGGER.error("IO exception while reading file: " + Arrays.toString(e.getStackTrace()));
				SystemUtils.halt();
			}
		}
		try {
			List<String> lines = Files.readAllLines(pth, StandardCharsets.UTF_8);
			String result = StringUtils.join(lines, "\n");
			return result;
		} catch (Exception e) {
			LOGGER.error("IO exception while reading file: " + Arrays.toString(e.getStackTrace()));
			SystemUtils.halt();
		}
		return "";
	}

	public static String readAllFromFile(File priFile) {
		final Path pth = priFile.toPath();
		if (!priFile.exists()) {
			try {
				LOGGER.error("Found no file at " + priFile.getCanonicalPath());
				SystemUtils.halt();
			} catch (IOException e) {
				LOGGER.error("IO exception while reading file: " + Arrays.toString(e.getStackTrace()));
				SystemUtils.halt();
			}
		}
		try {
			List<String> lines = Files.readAllLines(pth, StandardCharsets.UTF_8);
			String result = StringUtils.join(lines, "\n");
			return result;
		} catch (Exception e) {
			LOGGER.error("IO exception while reading file: " + Arrays.toString(e.getStackTrace()));
			SystemUtils.halt();
		}
		return "";
	}

	public static ArrayList<String> getAllFilesInFolderAsList(final String f) {
		String folderpath = getExistingFile2(f);
		ArrayList<String> files = new ArrayList<String>();
		File folder = new File(folderpath);
		if (folder.exists()) {
			for (final File fileEntry : folder.listFiles()) {
				if (fileEntry.isFile()) {
					files.add(fileEntry.getAbsolutePath());
				}
			}
		}
		return files;
	}

	public static ArrayList<String> getAllFileNamesInFolderAsList(final String f) {
		String folderpath = getExistingFile2(f);
		ArrayList<String> files = new ArrayList<String>();
		File folder = new File(folderpath);
		if (folder.exists()) {
			for (final File fileEntry : folder.listFiles()) {
				if (fileEntry.isFile()) {
					files.add(fileEntry.getName());
				}
			}
		}
		return files;
	}

	public static ArrayList<File> getAllFileNamesInFolderAsFiles(final String f) {
		String folderpath = getExistingFile2(f);
		ArrayList<File> files = new ArrayList<File>();
		File folder = new File(folderpath);
		if (folder.exists()) {
			for (final File fileEntry : folder.listFiles()) {
				if (fileEntry.isFile()) files.add(fileEntry);
			}
		}
		return files;
	}

	public static ArrayList<String> getAllFoldersInFolderAsList(final String f) {
		String folderpath = getExistingFile2(f);
		ArrayList<String> files = new ArrayList<String>();
		File folder = new File(folderpath);
		if (folder.exists()) {
			for (final File fileEntry : folder.listFiles()) {
				if (!fileEntry.isFile()) {
					files.add(fileEntry.getAbsolutePath());
				}
			}
		}
		return files;
	}

	public static String getFileFromFullPath(final String fullPath) {
		String[] priFileParts = fullPath.split("/");
		String file = priFileParts[priFileParts.length-1];
		return file;
	}

	public static void appendToFileUNIX2(final String outString, final String filePath) throws Exception {

		// File candidate 1
		File priFile = new File(filePath);
		String[] priFileParts = filePath.split("/");
		String priFolderTemp = Joiner.on("/").join(Arrays.copyOfRange(priFileParts, 0, priFileParts.length-1));
		File priFolder = new File(priFolderTemp);

		// File candidate 2
		String secondaryPath = filePath.replaceFirst("/", "");
		File secFile = new File(secondaryPath);
		String[] secFileParts = secondaryPath.split("/");
		String secFolderTemp = Joiner.on("/").join(Arrays.copyOfRange(secFileParts, 0, secFileParts.length-1));
		File secFolder = new File(secFolderTemp);

		if (priFolder.exists()) {
			appendToFile(outString, priFile.getAbsolutePath(), "\n");
		} else if (secFolder.exists() && !"".equals(secFolder.getPath())) {
			appendToFile(outString, secFile.getAbsolutePath(), "\n");
		} else {
			LOGGER.error("Folder does not exist at " + priFolder.getAbsolutePath() + ", fallback folder does not exist at " + secFolder.getAbsolutePath());
		}
	}

	public static String getExistingFolder(final String folderPath) {
		File folder1 = new File(folderPath);
		String secondaryPath = folderPath.replaceFirst("/", "");
		File folder2 = new File(secondaryPath);
		if (folder1.exists()) {
			return folderPath;
		} else {
			if (folder2.exists()) {
				return secondaryPath;
			}
		}
		LOGGER.error("Path does not exist at " + folder1.getAbsolutePath() + ", fallback file does not exist at " + folder2.getAbsolutePath());
		SystemUtils.halt();
		return "";
	}

	public static String getExistingFile(final String filePath) {
		File file1 = new File(filePath);
		String secondaryPath = filePath.replaceFirst("/", "");
		File file2 = new File(secondaryPath);
		if (file1.exists()) {
			return filePath;
		} else {
			if (file2.exists()) {
				return secondaryPath;
			}
		}
		LOGGER.error("File does not exist at " + filePath + ", fallback file does not exist at " + filePath.replaceFirst("/", ""));
		SystemUtils.halt();
		return "";
	}

	public static String getExistingFile2(final String filePath) {
		File file1 = new File(filePath);
		String secondaryPath = filePath.replaceFirst("/", "");
		File file2 = new File(secondaryPath);
		if (file1.exists()) {
			return filePath;
		} else {
			if (file2.exists()) {
				return secondaryPath;
			}
		}
		return "";
	}

	public static String getExistingFileIfPossible(final String filePath) {
		File file1 = new File(filePath);
		String secondaryPath = filePath.replaceFirst("/", "");
		String thirdPath = filePath.replace("\\", "");
		if (file1.exists()) {
			return filePath;
		} else {
			File file2 = new File(secondaryPath);
			if (file2.exists()) {
				return secondaryPath;
			} else {
				File file3 = new File(thirdPath);
				if (file3.exists()) {
					return thirdPath;
				}
			}
		}
		LOGGER.info("File does not exist at " + filePath + ", fallback file does not exist at " + secondaryPath + " or " + thirdPath);
		return "";
	}

	public static void deleteFilesInFolder(final String folderpath) {
		File dir = new File(folderpath);
		if (null != dir) {
			if (dir.exists()) {
				for (File f: dir.listFiles()) {
					if (f.exists() && f.isFile()) {
						LOGGER.info("Will delete file: " + f.getAbsolutePath() + " name=" + f.getName());
						if (f.delete() == false) {
							LOGGER.error("Unable to delete " + f.getAbsolutePath());
							SystemUtils.halt();
						} else {
							LOGGER.info("Deleted " + f.getAbsolutePath());
						}
					}
				}
			}
		}
	}

	public static void deleteFilesAndFoldersInFolder(final String folderpath) {
		Path path = Paths.get(folderpath);
		try {
			Files.walk(path)
			.sorted(Comparator.reverseOrder())
			.map(Path::toFile)
			.forEach(File::delete);
		} catch (IOException e) {
			LOGGER.error("Unable to delete folderpath " + folderpath + ", exception: " + e.getMessage());
			SystemUtils.halt();
		}
	}

	public static void appendToFileUNIXNoException(final String outString, final String filePath) {
		try {
			appendToFile(outString, filePath, "\n");
		} catch (Exception e) {
			LOGGER.info("e: " + e.getMessage());
		}
	}

	public static void writeToFileUNIXNoException(final String outString, final String filePath) {
		try {
			writeToFile(outString, filePath, "\n");
		} catch (Exception e) {
			LOGGER.info("e: " + e.getMessage());
		}
	}

	public static void writeToFileUNIXHaltOnException(final String outString, final String filePath) {
		try {
			writeToFile(outString, filePath, "\n");
		} catch (Exception e) {
			LOGGER.info("e: " + e.getMessage());
			SystemUtils.halt();
		}
	}

	public static String getRelativePath(File file, File folder) {
		String filePath = file.getAbsolutePath();
		String folderPath = folder.getAbsolutePath();
		if (filePath.startsWith(folderPath)) {
			return filePath.substring(folderPath.length() + 1);
		} else {
			return null;
		}
	}

	public static void clearFolder(String folderPath) {
		ArrayList<String> files = FilesUtils.getAllFilesInFolderAsList(folderPath);
		for (String fileName: files) {
			File f1 = new File(fileName);
			if (f1.exists()) {
				LOGGER.info("Deleting " + fileName);
				boolean deleteStatus = f1.delete();
				if (deleteStatus) {
					LOGGER.error("deleteStatus: " + deleteStatus);
				}
			}
		}
	}

	public static void removeMatchingRowsFromFileUNIX(String matchString, String filePath) throws Exception {
		ArrayList<String> keepers = new ArrayList<String>();
		List<String> allLines = readAllLinesFrom(filePath);
		for (String s: allLines) {
			if (s.contains(matchString)) {
				// skip
			} else {
				if (s.equals("")) {
					// skip
				} else {
					keepers.add(s);
				}

			}
		}
		writeToFileUNIX(Joiner.on("\n").join(keepers), filePath);
	}

	public static boolean moveFile(String sourcePath, String targetPath) {
		boolean fileMoved = true;
		try {
			Files.move(Paths.get(sourcePath), Paths.get(targetPath), StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			fileMoved = false;
			LOGGER.info("Exception: " + e.getMessage());
		}
		return fileMoved;
	}

	public static String findANDcreateMissingFoldersFor(String full_filepath) {
		File f = new File(full_filepath);
		String folderPath = f.getParent();
		String existingFolderPath = getExistingFileIfPossible(folderPath);
		if ("".equals(existingFolderPath)) {
			System.out.println("Folder " + folderPath + " does not exist, creating");
			File folder = new File(folderPath);
			if (!folder.exists()) {
				folder.mkdirs();
			}
			return folder.getPath();
		} else {
			return existingFolderPath;
		}

	}

	public static void createFolderUnlessExists(String folderpath) {
		File f = new File(folderpath);
		f.mkdirs();
	}

	public static boolean copyFile(File _src, File _dest) {
		FileInputStream inputStream = null;
		FileOutputStream outputStream = null;
		try {
			inputStream = new FileInputStream(_src.getAbsolutePath());
			outputStream = new FileOutputStream(_dest.getAbsolutePath());
			byte[] buffer = new byte[1024];
			int length;
			while ((length = inputStream.read(buffer)) > 0) {
				outputStream.write(buffer, 0, length);
			}
			return true;
		} catch (IOException e) {
			LOGGER.warn("Failed to copy the file: " + e.getMessage());
			return false;
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
				if (outputStream != null) {
					outputStream.close();
				}
			} catch (IOException e) {
				return false;
			}
		}
	}

}
