package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
       User res = null;

       for (User user : users) {
            if (user.getName().equals(login)) {
                res = user;
                break;
            }
       }
       if (res == null) {
           throw new UserNotFoundException("Can`t find this User");
       }
        return res;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getName().length() < 3) {
            throw new  UserInvalidException("User not validate");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };

        try {
          User user = findUser(users, "Petr Arsentev");
                if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }

    }
}
