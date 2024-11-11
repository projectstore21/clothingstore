import java.util.*;

public class Main {

    public static List<Product> productList = new ArrayList<>();
    public static Map<String, User> userMap = new HashMap<>();
    public static Map<Integer, Catalogue> catalogueMap = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Welcome to our clothing store!");

        productList.add(new Product("Men's shirt", 7.88, 5));
        productList.add(new Product("Men's jacket", 45, 8));
        productList.add(new Product("Men's pants", 15, 4));
        Product product4 = new Product();
        product4.setProductName("Men's socks");
        product4.setPrice(3);
        product4.setAmountInStock(30);
        productList.add(product4);
        productList.add(new Product("Men's T-shirt", 7, 32));
        productList.add(new Product("Men's Sweater", 35, 8));
        productList.add(new Product("Men's Hoodie", 23, 12));
        productList.add(new Product("Men's Scarf", 18, 4));
        productList.add(new Product("Men's Underwear", 5, 35));
        productList.add(new Product("Men's Blazer", 15, 13));
        productList.add(new Product("Men's Suit", 34, 8));
        productList.add(new Product("Men's Shorts", 14, 2));
        productList.add(new Product("Men's Chinos", 15, 9));
        productList.add(new Product("Men's Sportswear", 57, 4));
        productList.add(new Product("Men's Tie", 13, 4));
        productList.add(new Product("Woman's coat", 28.05, 10));
        productList.add(new Product("Woman's vest", 13.6, 3));
        productList.add(new Product("Woman's cardigan", 15.87, 22));
        productList.add(new Product("Woman's jeans", 15, 13));
        productList.add(new Product("Woman's underwear", 14.06, 6));
        productList.add(new Product("Woman's shorts", 8.89, 9));
        productList.add(new Product("Woman's dress", 21.21, 8));
        productList.add(new Product("Woman's robe", 18.5, 19));
        productList.add(new Product("Woman's blouse", 10.26, 11));
        productList.add(new Product("Woman's skirt", 19.5, 4));
        productList.add(new Product("Woman's bra", 11.89, 2));
        productList.add(new Product("Woman's panties", 6.07, 1));
        productList.add(new Product("Woman's top", 17.3, 16));
        productList.add(new Product("Woman's swimsuit", 22, 7));
        Product product30 = new Product();
        product30.setProductName("Woman's socks");
        product30.setPrice(2);
        product30.setAmountInStock(5);
        productList.add(product30);
        productList.add(new Product("Children's t-shirt", 15.99, 11));
        productList.add(new Product("Children's sweater", 20.50, 7));
        productList.add(new Product("Children's jeans", 30.00, 10));
        Product product34 = new Product();
        product34.setProductName("Children's coat");
        product34.setPrice(45.99);
        product34.setAmountInStock(12);
        productList.add(product34);
        Product product35 = new Product();
        product35.setProductName("Children's swimwear");
        product35.setPrice(10.99);
        product35.setAmountInStock(3);
        productList.add(product35);
        productList.add(new Product("Children's socks", 5, 15));
        productList.add(new Product("Children's skirt", 10.50, 20));
        productList.add(new Product("Children's trousers", 15, 10));
        productList.add(new Product("Children's jacket", 50, 5));
        productList.add(new Product("Children's dress", 35, 11));
        productList.add(new Product("Children's longsleeve", 16, 35));
        productList.add(new Product("Children's jumper", 13.50, 17));
        productList.add(new Product("Children's pijamas", 10.99, 4));
        productList.add(new Product("Children's shirts", 15.99, 12));
        productList.add(new Product("Children's mono", 16.99, 30));
        System.out.println("\nМетоды CRUD для класса Товар:");
        createProduct("Men's valenki", 55, 55);
        createProduct("Men's shapka", 8, 8);
        readProduct(3);
        updateProduct(1, "Men's varezhki", 9);
        deleteProduct(2);

        userMap.put("1A2B3C4D5E", User.registerNewUser("Ivan", "Ivanov", "ivanov@mail.ru", "male", "15.02.1991", "1A2B3C4D5E"));
        userMap.put("12345ABCDE", new User("Petr", "Petrov", "petrov@mail.ru", "male", "13.08.2004", "12345ABCDE"));
        User user3 = new User();
        user3.setUserName("Ira");
        user3.setUserSurname("Irinina");
        user3.setUserEmail("irinina@mail.ru");
        user3.setUserGender("female");
        user3.setUserBirthday("04.12.1987");
        user3.setPassportNumber("ABCDE12345");
        userMap.put(user3.getPassportNumber(), user3);
        userMap.put("78903C4D5E", User.registerNewUser("Eis", "Schneeman", "schneeman@gmail.com", "male", "23.12.2000", "78903C4D5E"));
        userMap.put("12345A1234", new User("Mark", "Rober", "rober@gmail.com", "male", "18.02.1977", "12345A1234"));
        User user6 = new User();
        user6.setUserName("Fabian");
        user6.setUserSurname("Huber");
        user6.setUserEmail("huber@gmail.com");
        user6.setUserGender("female");
        user6.setUserBirthday("12.12.2000");
        user6.setPassportNumber("123456789W");
        userMap.put(user6.getPassportNumber(), user6);
        userMap.put("DEFGH12345", User.registerNewUser("Nikita", "Nikitin", "nikitin@gmail.xom", "male", "14.01.1993", "DEFGH12345"));
        userMap.put("IJKLM67890", new User("Elena", "Elenina", "elenina@gmail.com", "female", "30.12.2003", "IJKLM67890"));
        User user9 = new User();
        user9.setUserName("Lara");
        user9.setUserSurname("Larina");
        user9.setUserEmail("larina@gmail.com");
        user9.setUserGender("female");
        user9.setUserBirthday("04.03.2000");
        user9.setPassportNumber("NOPQR54321");
        userMap.put(user9.getPassportNumber(), user9);
        System.out.println("\nМетоды CRUD для класса Пользователь:");
        createUser("Victoria", "Viki", "viki@gmail.com", "female", "23.05.2001", "12AB34CD56EF");
        createUser("Elena", "Elenina", "elenina@gmail.com", "female", "30.12.2003", "IJKLM67890");
        readUser("DEFGH12345");
        readUser("DEFGH12346");
        updateUser("Mark", "Smith", "rober@gmail.com", "male", "18.02.1978", "12345A1234");
        updateUser("Mark", "Smith", "rober@gmail.com", "male", "18.02.1978", "12345A1235");
        deleteUser("1A2B3C4D5E");
        deleteUser("1A2B3C4D5P");
        System.out.println("\nПользователи:");
        for (Map.Entry<String, User> users : userMap.entrySet()) {
            System.out.println(users);
        }

        Catalogue clothesForWoman = new Catalogue();
        clothesForWoman.setCatalogueName("allClothesForWoman");
        List<Product> womanProducts = productList.stream().filter(product -> product.toString().contains("Woman's")).toList();
        for (Product product : womanProducts) {
            product.setCatalogue(clothesForWoman);
        }
        clothesForWoman.setCatalogueProducts(womanProducts);
        catalogueMap.put(clothesForWoman.getCatalogueId(), clothesForWoman);
        Catalogue clothesForMen = new Catalogue();
        clothesForMen.setCatalogueName("allClothesForMen");
        List<Product> menProducts = productList.stream().filter(product -> product.toString().contains("Men's")).toList();
        for (Product product : menProducts) {
            product.setCatalogue(clothesForMen);
        }
        clothesForMen.setCatalogueProducts(menProducts);
        catalogueMap.put(clothesForMen.getCatalogueId(), clothesForMen);
        Catalogue clothesForChildren = new Catalogue();
        clothesForChildren.setCatalogueName("allClothesForChildren");
        List<Product> childrenProducts = productList.stream().filter(product -> product.toString().contains("Children's")).toList();
        for (Product product : childrenProducts) {
            product.setCatalogue(clothesForChildren);
        }
        clothesForChildren.setCatalogueProducts(childrenProducts);
        catalogueMap.put(clothesForChildren.getCatalogueId(), clothesForChildren);
        System.out.println("\nКаталоги:");
        catalogueMap.entrySet().stream().forEach(catalogue -> System.out.println(catalogue));

        System.out.println("\nПокупки:");
        Collections.shuffle(productList);
        Iterator<Product> productIterator = productList.iterator();
        userMap.forEach((passportNumbers, users) -> {
            if (productIterator.hasNext()) {
                Product product = productIterator.next();
                Catalogue productCatalogue = product.getCatalogue();
                System.out.println("User id=" + userMap.get(passportNumbers).getUserId() + " " + userMap.get(passportNumbers).getUserName() + " " + userMap.get(passportNumbers).getUserSurname() +
                        " положил в корзину товар с id=" + product.getProductId() + " '" +
                        product.getProductName() + "' из раздела каталога id=" + productCatalogue.getCatalogueId() +
                        " \"" + productCatalogue.getCatalogueName() + "\".");
            }
        });
    }

    public static void createProduct(String productName, double price, int amountInStock) {
        Product newProduct = new Product(productName, price, amountInStock);
        productList.add(newProduct);
        System.out.println("Товар " + newProduct.getProductName() + " был создан");
    }

    private static void readProduct(int productId) {
        for (Product product : productList) {
            if (product.getProductId() == productId) {
                System.out.println("Товар " + product.getProductName() + " id=" + productId + " был найден");
                return;
            }
        }
        System.out.println("Товар с id=" + productId + " не найден");
    }

    public static void updateProduct(int productId, String newName, double newPrice) {
        for (Product product : productList) {
            if (product.getProductId() == productId) {
                product.setProductName(newName);
                product.setPrice(newPrice);
                System.out.println("Товар с id=" + productId + " был обновлён");
                return;
            }
        }
        System.out.println("Товар с id=" + productId + " не найден");
    }

    public static void deleteProduct(int productId) {
        Iterator<Product> iterator = productList.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getProductId() == productId) {
                iterator.remove();
                System.out.println("Товар " + product.getProductName() + " был удален по id=" + productId);
                return;
            }
        }
        System.out.println("Товар с id=" + productId + " не найден");
    }

    public static void createUser(String userName, String userSurname, String userEmail, String userGender, String userBirthday, String passportNumber) {
        User newUser = new User(userName, userSurname, userEmail, userGender, userBirthday, passportNumber);
        if (userMap.containsKey(passportNumber)) {
            System.out.println("Error. User " + newUser.getUserName() + " passportNumber=" + newUser.getPassportNumber() + " already exists. ");
        } else {
            userMap.put(newUser.getPassportNumber(), newUser);
            System.out.println("User " + newUser.getUserName() + " passportNumber=" + newUser.getPassportNumber() + " has been created.");
        }
    }

    public static void readUser(String passportNumber) {
        if (userMap.containsKey(passportNumber)) {
            System.out.println("User " + userMap.get(passportNumber).getUserName() + " passportNumber=" + passportNumber + " is found: " + userMap.get(passportNumber));
        } else System.out.println("Error. User passportNumber=" + passportNumber + " is not found.");
    }

    public static void updateUser(String userName, String userSurname, String userEmail, String userGender, String userBirthday, String passportNumber) {
        if (userMap.containsKey(passportNumber)) {
            if (!userMap.get(passportNumber).getUserName().equals(userName)) {
                userMap.get(passportNumber).setUserName(userName);
                System.out.println("For user " + userMap.get(passportNumber).getUserName() + " passportNumber=" + passportNumber + " name has been update: " + userMap.get(passportNumber).getUserName() + ".");
            }
            if (!userMap.get(passportNumber).getUserSurname().equals(userSurname)) {
                userMap.get(passportNumber).setUserSurname(userSurname);
                System.out.println("For user " + userMap.get(passportNumber).getUserName() + " passportNumber=" + passportNumber + " surname has been update: " + userMap.get(passportNumber).getUserSurname() + ".");
            }
            if (!userMap.get(passportNumber).getUserEmail().equals(userEmail)) {
                userMap.get(passportNumber).setUserEmail(userEmail);
                System.out.println("For user " + userMap.get(passportNumber).getUserName() + " passportNumber=" + passportNumber + " email has been update: " + userMap.get(passportNumber).getUserEmail() + ".");
            }
            if (!userMap.get(passportNumber).getUserGender().equals(userGender)) {
                userMap.get(passportNumber).setUserGender(userGender);
                System.out.println("For user " + userMap.get(passportNumber).getUserName() + " passportNumber=" + passportNumber + " gender has been update: " + userMap.get(passportNumber).getUserGender() + ".");
            }
            if (!userMap.get(passportNumber).getUserBirthday().equals(userBirthday)) {
                userMap.get(passportNumber).setUserBirthday(userBirthday);
                System.out.println("For user " + userMap.get(passportNumber).getUserName() + " passportNumber=" + passportNumber + " B-day has been update: " + userMap.get(passportNumber).getUserBirthday() + ".");
            }
        } else System.out.println("Error. User passportNumber=" + passportNumber + " is not found.");
    }

    public static void deleteUser(String passportNumber) {
        if (userMap.containsKey(passportNumber)) {
            userMap.remove(passportNumber);
            System.out.println("User passportNumber=" + passportNumber + " has been removed.");
        } else System.out.println("Error. User passportNumber=" + passportNumber + " is not found.");
    }
}

