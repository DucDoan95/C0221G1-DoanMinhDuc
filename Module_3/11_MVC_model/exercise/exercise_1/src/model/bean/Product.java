package model.bean;

public class Product {
    private String id;
    private String name;
    private String price;
    private String description;
    private String manufacture;

    public Product() {
    }

    public Product(String id, String name, String price, String description, String manufacture) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.manufacture = manufacture;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }
}
