package model.services;

public class NotUniqueNicknameException extends Exception {
    public NotUniqueNicknameException(String message) {
        super(message);
    }
}