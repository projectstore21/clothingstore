public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to our clothing store!");
        Product product1 = new Product("Men's shirt", 7.88, 5);
        Product product2 = new Product("Men's jacket", 45, 8);
        Product product3 = new Product("Men's pants", 15, 4);
        Product product4 = new Product();
        product4.setProductName("Men's socks");
        product4.setPrice(3);
        product4.setAmountInStock(30);
        Product product5 = new Product("Men's T-shirt", 7, 32);
        Product product6 = new Product("Men's Sweater", 35, 8);
        Product product7 = new Product("Men's Hoodie", 23, 12);
        Product product8 = new Product("Men's Scarf", 18, 4);
        Product product9 = new Product("Men's Underwear", 5, 35);
        Product product10 = new Product("Men's Blazer", 15, 13);
        Product product11 = new Product("Men's Suit", 34, 8);
        Product product12 = new Product("Men's Shorts", 14, 2);
        Product product13 = new Product("Men's Chinos", 15, 9);
        Product product14 = new Product("Men's Sportswear", 57, 4);
        Product product15 = new Product("Men's Tie", 13, 4);
        Product product16 = new Product("Woman's coat", 28.05, 10);
        Product product17 = new Product("Woman's vest", 13.6, 3);
        Product product18 = new Product("Woman's cardigan", 15.87, 22);
        Product product19 = new Product("Woman's jeans", 15, 13);
        Product product20 = new Product("Woman's underwear", 14.06, 6);
        Product product21 = new Product("Woman's shorts", 8.89, 9);
        Product product22 = new Product("Woman's dress", 21.21, 8);
        Product product23 = new Product("Woman's robe", 18.5, 19);
        Product product24 = new Product("Woman's blouse", 10.26, 11);
        Product product25 = new Product("Woman's skirt", 19.5, 4);
        Product product26 = new Product("Woman's bra", 11.89, 2);
        Product product27 = new Product("Woman's panties", 6.07, 1);
        Product product28 = new Product("Woman's top", 17.3, 16);
        Product product29 = new Product("Woman's swimsuit", 22, 7);
        Product product30 = new Product();
        product30.setProductName("Woman's socks");
        product30.setPrice(2);
        product30.setAmountInStock(5);
        Product product31 = new Product("Children's t-shirt", 15.99, 11);
        Product product32 = new Product("Children's sweater", 20.50, 7);
        Product product33 = new Product("Children's jeans", 30.00, 10);
        Product product34 = new Product();
        product34.setProductName("Children's coat");
        product34.setPrice(45.99);
        product34.setAmountInStock(12);
        Product product35 = new Product();
        product35.setProductName("Children's swimwear");
        product35.setPrice(10.99);
        product35.setAmountInStock(3);
        Product product36 = new Product("Children's socks", 5, 15);
        Product product37 = new Product("Children's skirt", 10.50, 20);
        Product product38 = new Product("Children's trousers", 15, 10);
        Product product39 = new Product("Children's jacket", 50, 5);
        Product product40 = new Product("Children's dress", 35, 11);
        Product product41 = new Product("Children's longsleeve", 16, 35);
        Product product42 = new Product("Children's jumper", 13.50, 17);
        Product product43 = new Product("Children's pijamas", 10.99, 4);
        Product product44 = new Product("Children's shirts", 15.99, 12);
        Product product45 = new Product("Children's mono", 16.99, 30);

        User user1 = User.registerNewUser("Ivan", "Ivanov", "ivanov@mail.ru", "male", "15.02.1991", "1A2B3C4D5E");
        User user2 = new User("Petr", "Petrov", "petrov@mail.ru", "male", "13.08.2004", "12345ABCDE");
        User user3 = new User();
        user3.setUserName("Ira");
        user3.setUserSurname("Irinina");
        user3.setUserEmail("irinina@mail.ru");
        user3.setUserGender("female");
        user3.setUserBirthday("04.12.1987");
        user3.setPassportNumber("ABCDE12345");
    }
}


