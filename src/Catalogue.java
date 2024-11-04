import Exceptions.ProductNotFoundException;

import java.util.ArrayList;

public class Catalogue {
    private static int uniqueCatalogueId = 0;
    private final int catalogueId;
    private String catalogueName;
    private ArrayList<Product> CatalogueProducts;

    // Создаем пустой конструктор:
    public Catalogue() {
        this.catalogueId = ++uniqueCatalogueId;
    }

    // Создаем не пустой конструктор:
    public Catalogue(int catalogueId, String catalogueName, ArrayList<Product> CatalogueProducts) {
        this.catalogueId = ++uniqueCatalogueId;
        this.catalogueName = catalogueName;
        this.CatalogueProducts = CatalogueProducts;
    }

    // Сеттер ID каталога
    public void setCatalogueId (String CatalogueId) {
        this.catalogueId = catalogueId;
    }

    // Сеттер наименования каталога (раздела)
    public void setCatalogueName (String CatalogueName) {
        this.catalogueName = catalogueName;
    }

    // Метод для добавления товар(ов) в каталог
    public void addProductToCatalogue (Product product) throws ProductNotFoundException {
        if (product != null) {
            this.CatalogueProducts.add(product);
        } else {
            throw new ProductNotFoundException("Product not found.");
        }
    }

    // Геттер ID каталога
    public int getCatalogueId () {
        return catalogueId;
    }

    // Геттер наименования каталога (раздела)
    public String getCatalogueName () {
        return catalogueName;
    }

    // Геттер списка товаров в каталоге
    public ArrayList<Product> getCatalogueProductList () {
        return CatalogueProducts;
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return "Catalogue Id: " + catalogueId +
                "; catalogue name: " + catalogueName +
                "; catalogue products: " + CatalogueProducts + ".";
    }
}
