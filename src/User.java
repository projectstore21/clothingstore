import java.util.Objects;

public class User {

    private static int uniqueUserId = 0;
    private int userId;
    private String userName;
    private String userSurname;
    private String userEmail;
    private String userGender;
    private String userBirthday;
    private String passportNumber;

    public User() {
        this.userId = ++uniqueUserId;
    }

    public User(String userName, String userSurname, String userEmail, String userGender, String userBirthday, String passportNumber) {
        this.userId = ++uniqueUserId;
        this.userName = userName;
        this.userSurname = userSurname;
        this.userEmail = userEmail;
        this.userGender = userGender;
        this.userBirthday = userBirthday;
        this.passportNumber = passportNumber;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public static User registerNewUser(String userName, String userSurname, String userEmail, String userGender, String userBirthday, String passportNumber) {
        try {
            validateData(userName, userSurname, userEmail, userGender, userBirthday, passportNumber);
            validateUserEmail(userEmail);
            validateUserGender(userGender);
            validatePassportNumber(passportNumber);
        } catch (EmptyException | FormatException | EqualException | InvalidPassportException e) {
            System.out.println("Can't create user " + userName + ". Error: " + e.getMessage());
            return null;
        }
        User user = new User(userName, userSurname, userEmail, userGender, userBirthday, passportNumber);
        return user;
    }

    public static class InvalidPassportException extends Exception {
        public InvalidPassportException(String message) {
            super(message);
        }
    }

    public static class EmptyException extends Exception {
        public EmptyException(String message) {
            super(message);
        }
    }

    public static void validateData(String userName, String userSurname, String userEmail, String userGender, String userBirthday, String passportNumber) throws EmptyException {
        if (userName.isEmpty() || userSurname.isEmpty() || userEmail.isEmpty() || userGender.isEmpty() || userBirthday.isEmpty() || passportNumber.isEmpty()) {
            throw new EmptyException("Data can't be empty.");
        }
    }

    public static class FormatException extends Exception {
        public FormatException(String message) {
            super(message);
        }
    }

    public static void validateUserEmail(String userEmail) throws FormatException {
        if (!userEmail.contains("@")) {
            throw new FormatException("It is the incorrect format of the email.");
        }
    }

    public static class EqualException extends Exception {
        public EqualException(String message) {
            super(message);
        }
    }

    public static void validateUserGender(String userGender) throws EqualException {
        if (!Objects.equals(userGender, "male") & !Objects.equals(userGender, "female")) {
            throw new EqualException("You can choose male or female gender.");
        }
    }

    public static void validatePassportNumber(String passportNumber) throws InvalidPassportException {
        if (passportNumber.length() != 10) {
            throw new InvalidPassportException("Passport number must be 10 characters long.");
        }
    }

    @Override
    public String toString() {
        return "User {" + "id='" + getUserId() + '\'' +
                ", name='" + getUserName() + '\'' +
                ", surname='" + getUserSurname() + '\'' +
                ", mail='" + getUserEmail() + '\'' +
                ", gender='" + getUserGender() + '\'' +
                ", B-day='" + getUserBirthday() + '\'' +
                ", passport='" + getPassportNumber() + '\'' + '}';
    }
}