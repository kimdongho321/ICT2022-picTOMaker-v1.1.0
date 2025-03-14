package kr.co.picTO.common.exception;

public class CustomRefreshTokenException extends RuntimeException {
    public CustomRefreshTokenException() {
        super();
    }

    public CustomRefreshTokenException(String message) {
        super(message);
    }

    public CustomRefreshTokenException(String message, Throwable cause) {
        super(message, cause);
    }
}
