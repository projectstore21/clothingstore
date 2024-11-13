import java.io.*;
import java.util.List;
import java.util.Scanner;

public class FileCopy {
    File inputFile = new File("newProducts.txt");
    File outputFile = new File("createProducts.txt");

    public void readProductsFromFile () {

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("_");
                if (parts.length == 3) {
                    String productName = parts[0];
                    double price = Double.parseDouble(parts[1]);
                    int amountInStock = Integer.parseInt(parts[2]);
                    Main.productList.add(new Product(productName, price, amountInStock));
                }
            }
            System.out.println("Товары из файла были успешно внесены в список товаров.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeProductsToFile () {
        List<Product> productList = Main.productList;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (Product product : productList) {
                writer.write(product.toString());
                writer.newLine();
            }
            System.out.println("Товары из списка товаров были успешно записаны в файл.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
