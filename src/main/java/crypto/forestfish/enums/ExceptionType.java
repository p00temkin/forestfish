package crypto.forestfish.enums;

public enum ExceptionType {
    NODE_RECOVERABLE,
    NODE_UNSTABLE,
    NODE_UNAVAILABLE,
    
    TX_MIGHT_BE_PENDING,
    TX_RESENT,
    TX_SKIP,
    
    FATAL,
    UNKNOWN
}
