import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to our clothing store!");

        ArrayList<Product> productList = new ArrayList<>();
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

        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("Ivan", "Ivanov", "ivanov@mail.ru", "male", "15.02.1991", "1A2B3C4D5E"));
        userList.add(new User("Petr", "Petrov", "petrov@mail.ru", "male", "13.08.2004", "12345ABCDE"));
        User user3 = new User();
        user3.setUserName("Ira");
        user3.setUserSurname("Irinina");
        user3.setUserEmail("irinina@mail.ru");
        user3.setUserGender("female");
        user3.setUserBirthday("04.12.1987");
        user3.setPassportNumber("ABCDE12345");
        userList.add(user3);
        userList.add(new User("Eis", "Schneeman", "schneeman@gmail.com", "male", "23.12.2000", "78903C4D5E"));
        userList.add(new User("Mark", "Rober", "rober@gmail.com", "male", "18.02.1977", "12345A1234"));
        User user6 = new User();
        user6.setUserName("Fabian");
        user6.setUserSurname("Huber");
        user6.setUserEmail("huber@gmail.com");
        user6.setUserGender("female");
        user6.setUserBirthday("12.12.2000");
        user6.setPassportNumber("123456789W");
        userList.add(user6);
        userList.add(new User("Nikita", "Nikitin", "nikitin@gmail.xom", "male", "14.01.1993", "DEFGH12345"));
        userList.add(new User("Elena", "Elenina", "elenina@gmail.com", "female", "30.12.2003", "IJKLM67890"));
        User user9 = new User();
        user9.setUserName("Lara");
        user9.setUserSurname("Larina");
        user9.setUserEmail("larina@gmail.com");
        user9.setUserGender("female");
        user9.setUserBirthday("04.03.2000");
        user9.setPassportNumber("NOPQR54321");
        userList.add(user9);

        Catalogue clothesForWoman = new Catalogue();
        clothesForWoman.setCatalogueName("allClothesForWoman");
        Stream streamForProductList = productList.stream();
        clothesForWoman.setCatalogueProducts((ArrayList<Product>) streamForProductList.filter(x -> x.toString().contains("Woman's")).collect(Collectors.toList()));

        Catalogue clothesForMen = new Catalogue();
        clothesForMen.setCatalogueName("allClothesForMen");
        Stream streamForProductList2 = productList.stream();
        clothesForMen.setCatalogueProducts((ArrayList<Product>) streamForProductList2.filter(x -> x.toString().contains("Men's")).collect(Collectors.toList()));

        Catalogue clothesForChildren = new Catalogue();
        clothesForChildren.setCatalogueName("allClothesForChildren");
        Stream streamForProductList3 = productList.stream();
        clothesForChildren.setCatalogueProducts((ArrayList<Product>) streamForProductList3.filter(x -> x.toString().contains("Children's")).collect(Collectors.toList()));


        Collections.shuffle(productList);
        Iterator<Product> productIterator = productList.iterator();
        userList.forEach(user -> {
            if (productIterator.hasNext()) {
                Product product = productIterator.next();
                String catalogueName = "Unknown";
                if (product.getProductName().contains("Woman")) {
                    catalogueName = clothesForWoman.getCatalogueName();
                } else if (product.getProductName().contains("Men")) {
                    catalogueName = clothesForMen.getCatalogueName();
                } else if (product.getProductName().contains("Children")) {
                    catalogueName = clothesForChildren.getCatalogueName();
                }
                System.out.println("User: " + user.getUserId() + " " + user.getUserName() + " " + user.getUserSurname() +
                        " положил в корзину товар с id=" + product.getProductId() + ", '" +
                        product.getProductName() + "' из раздела каталога: " + catalogueName);
            }
        });
    }
}
