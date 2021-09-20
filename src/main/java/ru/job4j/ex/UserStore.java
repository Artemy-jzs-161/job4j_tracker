package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(login)) {
                rsl = users[i];
                break;
            }
            if (rsl == null) {
                throw new UserNotFoundException("Пользователь не найден в списке");
            }
        }
        return rsl;
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

