package hw_4.exception.service;

public class EmptyUserListException extends UserServiceException {
    public EmptyUserListException() {
        super("В системе пока нет пользователей");
    }

    public EmptyUserListException(Throwable cause) {
        super("В системе пока нет пользователей", cause);
    }
}