package kr.co.picTO.common.exception;

public class CustomEmailSignUpFailedException extends RuntimeException{

    public CustomEmailSignUpFailedException() {
        super();
    }

    public CustomEmailSignUpFailedException(String message) {
        super(message);
    }

    public CustomEmailSignUpFailedException(String mesasge, Throwable throwable) {
        super(mesasge, throwable);
    }
}
