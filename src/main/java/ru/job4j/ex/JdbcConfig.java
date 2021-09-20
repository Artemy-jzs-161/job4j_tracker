package ru.job4j.ex;

public class JdbcConfig {
    public static void load(String url) throws UserInputException {
        if (url == null) {
            throw new UserInputException("Url could not be null");
        }
    }

    public static void main(String[] args) throws UserInputException {
        load("jdbc://localhost:8080");
    }
}
