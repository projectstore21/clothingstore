public class Product {
    private static int uniqueId = 0;
    private final int productId;
    private String productName;
    private double price;
    private int amountInStock;
    private Catalogue catalogue;

    public Product() {
        this.productId = ++uniqueId;
    }

    public Product(String productName, double price, int amountInStock) {
        this.productId = ++uniqueId;
        this.productName = productName;
        setPrice(price);
        setAmountInStock(amountInStock);
    }

    public Catalogue getCatalogue() {
        return catalogue;
    }

    public void setCatalogue(Catalogue catalogue) {
        this.catalogue = catalogue;
    }

    public int getProductId() {
        return productId;
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
        if (validatePrice(price)) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Цена должна быть положительным значением.");
        }
    }

    private boolean validatePrice(double price) {
        return price >= 0;
    }

    public void setAmountInStock(int amountInStock) {
        if (validateAmountInStock(amountInStock)) {
            this.amountInStock = amountInStock;
        } else {
            throw new IllegalArgumentException("Количество на складе должно быть неотрицательным целым числом.");
        }
    }

    private boolean validateAmountInStock(int amountInStock) {
        return amountInStock >= 0;
    }

    @Override
    public String toString() {
        return "Product: " +
                "ProductId = " + productId + "; " +
                "productName: " + productName + "; " +
                "price: " + price + "; " +
                "amountInStock: " + amountInStock +
                "; catalogue: " + (catalogue != null ? catalogue.getCatalogueName() : "None");
    }
}
    