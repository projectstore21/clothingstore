import Exceptions.ProductNotFoundException;

import java.util.ArrayList;

public class Catalogue {
    private static int uniqueCatalogueId = 0;
    private final int catalogueId;
    private String catalogueName;
    private ArrayList<Product> catalogueProducts;

    public Catalogue() {
        this.catalogueId = ++uniqueCatalogueId;
    }

    public Catalogue(int catalogueId, String catalogueName, ArrayList<Product> CatalogueProducts) {
        this.catalogueId = ++uniqueCatalogueId;
        this.catalogueName = catalogueName;
        this.catalogueProducts = CatalogueProducts;
    }

    public void setCatalogueName (String CatalogueName) {
        this.catalogueName = catalogueName;
    }

    public void addProductToCatalogue (Product product) throws ProductNotFoundException {
        if (product != null) {
            this.catalogueProducts.add(product);
        } else {
            throw new ProductNotFoundException("Product not found.");
        }
    }

    public int getCatalogueId () {
        return catalogueId;
    }

    public String getCatalogueName () {
        return catalogueName;
    }

    public ArrayList<Product> getCatalogueProductList () {
        return catalogueProducts;
    }

    @Override
    public String toString() {
        return "Catalogue Id: " + catalogueId +
                "; catalogue name: " + catalogueName +
                "; catalogue products: " + catalogueProducts + ".";
    }
}
