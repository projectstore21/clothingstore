public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to our clothing store!");
        User user1 = User.registerNewUser("Ivan", "Ivanov", "ivanov@mail.ru", "male", "15.02.1991");
        User user2 = new User("Petr", "Petrov", "petrov@mail.ru", "male", "13.08.2004");
        User user3 = new User();
        user3.setUserName("Ira");
        user3.setUserSurname("Irinina");
        user3.setUserEmail("irinina@mail.ru");
        user3.setUserGender("female");
        user3.setUserBirthday("04.12.1987");
    }
}
