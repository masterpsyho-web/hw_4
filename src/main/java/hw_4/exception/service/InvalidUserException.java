package hw_4.exception.service;

public class InvalidUserException extends UserServiceException {
    public InvalidUserException(String message) {
        super(message);
    }

    public InvalidUserException(String message, Throwable cause) {
        super(message, cause);
    }
}