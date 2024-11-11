import Exceptions.ExistingProductTypeCatalogueException;
import Exceptions.ProductNotFoundException;

import java.util.ArrayList;
import java.util.List;


public class Catalogue {
    private static int uniqueCatalogueId = 0;
    private final int catalogueId;
    private String catalogueName;
    private List<Product> catalogueProducts;
    private ProductType catalogueProductType;

    public Catalogue() {
        this.catalogueId = ++uniqueCatalogueId;
        this.catalogueProducts = new ArrayList<>();
    }

    public Catalogue(String catalogueName, ProductType catalogueProductType) {
        this.catalogueId = ++uniqueCatalogueId;
        this.catalogueProducts = new ArrayList<>();
        this.catalogueName = catalogueName;
        this.catalogueProductType = catalogueProductType;
    }

    public void setCatalogueProductType(ProductType catalogueProductType) throws ExistingProductTypeCatalogueException {
        if (!Main.catalogueMap.containsKey(catalogueProductType)) {
            this.catalogueProductType = catalogueProductType;
        } else throw new ExistingProductTypeCatalogueException("Каталог с этой категорией товаров уже существует.");
    }

    public void setCatalogueName(String catalogueName) {
        this.catalogueName = catalogueName;
    }

    public void setCatalogueProducts(List<Product> catalogueProducts) {
        this.catalogueProducts = catalogueProducts;
    }

    public void addProductToCatalogue(Product product) throws ProductNotFoundException {
        if (product != null) {
            this.catalogueProducts.add(product);
        } else {
            throw new ProductNotFoundException("Product not found.");
        }
    }

    public int getCatalogueId() {
        return catalogueId;
    }

    public String getCatalogueName() {
        return catalogueName;
    }

    public List<Product> getCatalogueProducts() {
        return catalogueProducts;
    }

    public ProductType getCatalogueProductType() {
        return catalogueProductType;
    }

    @Override
    public String toString() {
        return "Catalogue Id: " + catalogueId +
                "; catalogue name: " + catalogueName +
                "; catalogue products: " + catalogueProducts + ".";
    }
}
