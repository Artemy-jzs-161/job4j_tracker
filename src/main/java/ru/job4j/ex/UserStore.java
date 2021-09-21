package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                return user;
            }
        }
        throw new UserNotFoundException("Пользователь не найден в списке");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid()) {
            throw new UserInvalidException("Неверный пользователь");
        }
        if (user.getUsername().length() < 3) {
            throw new UserInvalidException("Имя пользователя менее трёх символов");
        }
        return true;
    }

    public static void main(String[] args) throws UserInvalidException {
        User[] users = {new User("Petr Arsentev", true)};
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("У этого пользователя есть доступ");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        } catch (UserNotFoundException u) {
            u.printStackTrace();
        }
    }
}

