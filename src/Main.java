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
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);







    }
}