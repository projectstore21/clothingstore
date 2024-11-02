public class Product {
    private static int uniqueId = 0;
    private final int id;
    private String productName;
    private double price;
    private int amountInStock;

    public Product() {
        this.id = ++uniqueId;
    }

    public Product(String productName, double price, int amountInStock) {
        this.id = ++uniqueId;
        this.productName = productName;
        this.price = price;
        this.amountInStock = amountInStock;
    }

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getAmountInStock() {
        return amountInStock;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAmountInStock(int amountInStock) {
        this.amountInStock = amountInStock;
    }

    @Override
    public String toString() {
        return "Product:" + " " +
                "id = " + id + "; " +
                "productName:" + " " + productName + "; " +
                "price: " + price + "; " +
                "amountInStock: " + amountInStock +
                ").";

    }
}
