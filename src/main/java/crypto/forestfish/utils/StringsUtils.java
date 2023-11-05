package crypto.forestfish.utils;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringsUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(StringsUtils.class);
	
	/**
	 * Identical: 1.0d
	 * Slightly different: 0.8d
	 * Completely different: 0.0d
	 * https://search.r-project.org/CRAN/refmans/comparator/html/LCS.html
	 */
    public static double lcsSimilarity(final String a, final String b) {
    	if (null == a) return 0.0d;
    	if (null == b) return 0.0d;
    	if ("".equals(a)) return 0.0d;
    	if ("".equals(b)) return 0.0d;
        String result = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(a, b);
        double base = a.length() + b.length() - result.length();
        double similarity = result.length()/base;
        return NumUtils.round(similarity, 5);
    }
	
    public static String[] stringSplit(String[] delimiters, String input_words) {
        String[] input_words_split = null;
        input_words_split = input_words.split(delimiters[0], Integer.MAX_VALUE);
        return input_words_split;
    }

    public static boolean isHexString(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!isHexChar(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    
    public static String removeLastChar(String str) {
        return removeLastChars(str, 1);
    }

    public static String removeFirstChar(String str) {
        return str.substring(1);
    }

    public static String removeLastChars(String str, int chars) {
        return str.substring(0, str.length() - chars);
    }

    public static boolean isHexChar(char c) {
        return (c >= '0' && c <= '9') || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F');
    }

    public static String toUnicode(char ch) {
        return String.format("\\u%04x", (int) ch);
    }

    public static String encodeFileToBase64PNG(final String fileName) throws IOException {
        File file = new File(fileName);
        byte[] bytes = loadFile(file);
        byte[] encoded = Base64.encodeBase64(bytes);
        String encodedString = new String(encoded);
        return "data:image/png;base64," + encodedString;
    }
    
    public static String decodeBase64String(final String encodedString) {
    	Base64 base64 = new Base64();
    	String decodedString = new String(base64.decode(encodedString.getBytes()));
    	return decodedString;
    }

    public static String encodeBytesToBase64(final byte[] bytes) {
        byte[] encoded = Base64.encodeBase64(bytes);
        String encodedString = new String(encoded);
        return encodedString;
    }
    
    public static String encodeStringToBase64(final String str) {
        byte[] bytes = str.getBytes();
        byte[] encoded = Base64.encodeBase64(bytes);
        String encodedString = new String(encoded);
        return encodedString;
    }

    public static List<String> ngrams(int n, String str) {
        List<String> ngrams = new ArrayList<String>();
        String[] words = str.split("");
        for (int i = 0; i < words.length - n + 1; i++)
            ngrams.add(concat(words, i, i+n));
        return ngrams;
    }

    public static String concat(String[] words, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++)
            sb.append((i > start ? " " : "") + words[i]);
        return sb.toString();
    }
    
    public static String cleanJSON(final String _str) {
        String oldString = _str;
        String newString = _str;
        boolean change = true;
        while (change) {
            newString = oldString
            		.replace("\r", " ")
            		.replace("\n", " ")
                    .replace("  ", " ")
                    .replace(",}", "}")
                    .replace(", }", "}")
                    .trim();
            newString = StringUtils.stripEnd(newString," ");
            if (newString.equals(oldString)) {
                change = false;
            } else {
                oldString = newString;
            }
        }
        return newString;
    }


    private static byte[] loadFile(File file) throws IOException {
        InputStream is = new FileInputStream(file);

        long length = file.length();
        byte[] bytes = new byte[(int)length];

        int offset = 0;
        int numRead = 0;
        while (offset < bytes.length
                && (numRead=is.read(bytes, offset, bytes.length-offset)) >= 0) {
            offset += numRead;
        }

        if (offset < bytes.length) {
            is.close();
            throw new IOException("Could not completely read file "+file.getName());
        }

        is.close();
        return bytes;
    }

    public static String cutAndPadStringTo50(String s) {
        final Integer maxLength = 50;
        if (s.length() > maxLength) {
            s = s.substring(0, Math.min(s.length(), maxLength)) + " ...";
        }
        return s;
    }

    public static String cutAndPadStringToN(String s, Integer n) {
        final Integer wantedLength = n;
        if (s.length() > (wantedLength-3)) {
            s = s.substring(0, wantedLength-3) + ".. ";
        } else if (s.length() == wantedLength) {
            // we are done
        } else {
            while (s.length() < wantedLength) {
                s = s + " ";
            }
        }
        return s;
    }
    
    public static String prefixStringWith0sToLengthN(String s, final Integer wantedLength) {
        if (s.length() > wantedLength) {
            LOGGER.info("string is longer than intended length, returning identical string");
            return s;
        } else if (s.length() == wantedLength) {
            // done
        } else {
            while (s.length() < wantedLength) {
                s = "0" + s;
            }
        }
        return s;
    }

    public static String hex2String(String hex) {
        return hex2String(hex, false);

    }

    public static String hex2String(String hex, boolean nullAsSpace) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < hex.length(); i+=2) {
            String str = hex.substring(i, i+2);
            final char c = (char)Integer.parseInt(str, 16);
            if (nullAsSpace && c == 0)
                output.append(' ');
            else
                output.append(c);
        }
        return output.toString();
    }

    public static String hexToAscii(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(n / 2);
        for (int i = 0; i < n; i += 2) {
            char a = s.charAt(i);
            char b = s.charAt(i + 1);
            sb.append((char) ((hexToInt(a) << 4) | hexToInt(b)));
        }
        return sb.toString();
    }

    private static int hexToInt(char ch) {
        System.out.println(ch);
        if ('a' <= ch && ch <= 'f') { return ch - 'a' + 10; }
        if ('A' <= ch && ch <= 'F') { return ch - 'A' + 10; }
        if ('0' <= ch && ch <= '9') { return ch - '0'; }
        throw new IllegalArgumentException(String.valueOf(ch));
    }

    public static String cutStringFromLeft(String s, Integer maxLength) {
        return StringUtils.left(s,maxLength);
    }

    public static String cutStringFromRight(String s, Integer maxLength) {
        return StringUtils.right(s,maxLength);
    }

    public static boolean isAlphanumeric(String str) {
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if (c < 0x30 || (c >= 0x3a && c <= 0x40) || (c > 0x5a && c <= 0x60) || c > 0x7a) {
                return false;
            }
        }
        return true;
    }

    public static boolean isRandomCharacter(char ch) {
        return "$+:;@<>#".indexOf(ch) >= 0;
    }

    public static boolean hasAlphaUpperAndLowerAndNumeric(String str) {
        boolean hasAlphaUpper = false;
        boolean hasAlphaLower = false;
        boolean hasNumeric = false;

        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) hasAlphaUpper = true;
            if (Character.isLowerCase(c)) hasAlphaLower = true;
            if (Character.isDigit(c)) hasNumeric = true;
        }
        return hasAlphaLower && hasAlphaUpper && hasNumeric;
    }
    
    public static String onlykeepAlphaNumeric(String _str) {
    	StringBuffer sb = new StringBuffer();
        for (int i=0; i<_str.length(); i++) {
            char c = _str.charAt(i);
            if (false ||
            		Character.isSpaceChar(c) ||
            		Character.isUpperCase(c) ||
            		Character.isLowerCase(c) ||
            		Character.isDigit(c) ||
            		false) {
            	sb.append(c);
            }
        }
        return sb.toString();
    }

    public static boolean isOnlyAlpha(String str) {
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOnlyNumeric(String str) {
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOnlyAlphaOrNumeric(String str) {
        return isOnlyNumeric(str) || isOnlyAlpha(str);
    }

    public static String removeFromFirstNonAlphaAndDash(final String inputString) {
        final String[] fullIndex = inputString.split("(?![A-Za-z0-9-])");
        if (fullIndex.length > 1) {
            return fullIndex[0];
        }
        return inputString;
    }

    public static boolean isAsciiPrintable(String str) {
        if (str == null) {
            return false;
        }
        int sz = str.length();
        for (int i = 0; i < sz; i++) {
            if (isAsciiPrintable(str.charAt(i)) == false) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAsciiPrintable(char ch) {
        return ch >= 32 && ch < 127;
    }

    public static String keepOnlyAsciiPrintable(String str) {
        return str.replaceAll("[^\\p{ASCII}]", "");
    }

    public static String removeLastLineBreak(String str) {
        return str.replace("\n", "").replace("\r", "");
    }

    public static String removeLastDot(String string) {
        int ind = string.lastIndexOf(".");
        string = new StringBuilder(string).replace(ind, ind+1,"").toString();
        return string;
    }

    public static String wrapWithQuotes(final long str) {
        return "\"" + str + "\"";
    }

    public static String wrapWithQuotes(final String str) {
        return "\"" + str + "\"";
    }

    public static String wrapWithQuotes(final int str) {
        return "\"" + str + "\"";
    }

    public static String makeOnlyFirstCharUpperCase(String input) {
        input = input.toLowerCase();
        String output = input.substring(0, 1).toUpperCase() + input.substring(1);
        return output;
    }

    public static int orderOf(String s, ArrayList<String> arrList) {
        int order = 0;
        for (String entry: arrList) {
            if (s.equals(entry)) {
                return order;
            } else {
                order++;
            }
        }
        return order;
    }

    public static HashMap<String, Integer> wordCount(String input, String splitString, HashMap<String, Boolean> stopWords) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        String[] words = input.split(splitString);
        for (String word: words) {
            if (null == stopWords.get(word)) {
                Integer value = result.get(word);
                if (null == value) {
                    result.put(word, 1);
                } else {
                    value++;
                    result.put(word, value);
                }
            }
        }
        return result;
    }

    public static String extractDateFromString(String input) {
        String regex = "(\\d{4}-\\d{2}-\\d{2})";
        Matcher m = Pattern.compile(regex).matcher(input);
        if (m.find()) {
            return m.group(1);
        } else {
            String regex2 = "(\\d{8})";
            Matcher m2 = Pattern.compile(regex2).matcher(input);
            if (m2.find()) {
                String dateCandidate = m2.group(1);
                if (dateCandidate.startsWith("20")) {
                    return dateCandidate;
                } else {
                    return "N/A";
                }
            } else {
                return "N/A";
            }
        }
    }

    public static String determineExistingFilePath(String filePath) {
        File s = new File(filePath);
        if (!s.exists()) {
            String alternativeFilePath1 = filePath.replaceFirst("/", "");
            File sAlternative = new File(alternativeFilePath1);
            if (sAlternative.exists()) {
                filePath = alternativeFilePath1;
            } else {
                String alternativeFilePath2 = filePath.replaceFirst(".gen", "");
                File sAlternative2 = new File(alternativeFilePath2);
                if (sAlternative2.exists()) {
                    filePath = alternativeFilePath2;
                } else {
                    String alternativeFilePath3 = filePath.replaceFirst("/", "").replaceFirst(".gen", "");
                    File sAlternative3 = new File(alternativeFilePath3);
                    if (sAlternative3.exists()) {
                        filePath = alternativeFilePath3;
                    } else {
                        System.out.println("Unable to find file, tried " + filePath + "," + alternativeFilePath1 + "," + alternativeFilePath2 + " and " + alternativeFilePath3);
                        filePath = "";
                    }
                }
            }
        }

        return filePath;

    }

    public static long countUpperCase(String inputString) {
        return inputString.chars().filter((s)->Character.isUpperCase(s)).count();
    }

    public static long countLowerCase(String inputString) {
        return inputString.chars().filter((s)->Character.isLowerCase(s)).count();
    }

    public static String padStart(String str, int minLength, char padChar) {
        str = nullToEmpty(str);
        if (str.length() >= minLength) {
            return str;
        } else {
            StringBuilder sb = new StringBuilder(minLength);
            int padCount = minLength - str.length();
            while (sb.length() < padCount) {
                sb.append(padChar);
            }
            sb.append(str);
            return sb.toString();
        }
    }

    public static String nullToEmpty(String input) {
        if (input != null) {
            return input;
        } else {
            return "";
        }
    }
    
    public static boolean isValidUUID(String _str) {
    	return isUUID3(_str);
    }

    public static boolean isUUID1(String _str) {
    	if (null == _str) return false;
        try{
            UUID.fromString(_str);
            return true;
        } catch (IllegalArgumentException exception){
            return false;
        }
    }
    
    // https://www.code4copy.com/java/validate-uuid-string-java/
    private final static Pattern UUID_REGEX_PATTERN = Pattern.compile("^[{]?[0-9a-fA-F]{8}-([0-9a-fA-F]{4}-){3}[0-9a-fA-F]{12}[}]?$");
    public static boolean isUUID2(String _str) {
        if (_str == null) return false;
        return UUID_REGEX_PATTERN.matcher(_str).matches();
    }
    
    public static boolean isUUID3(String _str) {
    	if (null == _str) return false;
        if (_str.split("-").length == 5) {
            if (StringsUtils.isAlphanumeric(_str.replace("-", ""))) {
                return true;
            }
        }
        return false;
    }

    public static String replaceLast(String text, String regex, String replacement) {
        return text.replaceFirst("(?s)"+regex+"(?!.*?"+regex+")", replacement);
    }
    
    public static boolean isValidBase58(String input) {
        if (input == null) return false;
        String base58Chars = "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz";
        for (char c : input.toCharArray()) {
            if (base58Chars.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}