package bai_tap;

import java.io.Serializable;

public class Product implements Serializable {
    private String productID;
    private String productName;
    private String productCompany;
    private double productPrice;
    private String description;

    public Product() {
    }

    public Product(String productID, String productName, String productCompany, double productPrice, String description) {
        this.productID = productID;
        this.productName = productName;
        this.productCompany = productCompany;
        this.productPrice = productPrice;
        this.description = description;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCompany() {
        return productCompany;
    }

    public void setProductCompany(String productCompany) {
        this.productCompany = productCompany;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID='" + productID + '\'' +
                ", productName='" + productName + '\'' +
                ", productCompany='" + productCompany + '\'' +
                ", productPrice=" + productPrice +
                ", description='" + description + '\'' +
                '}';
    }
}
