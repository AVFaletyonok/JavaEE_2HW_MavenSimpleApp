package org.example;

public class Product {

    private Long id;
    private String description;
    private Long price;
    private Long count;

    public Product() {
    }

    public Product(Long id, String description, Long price, Long count) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.count = count;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "\nProduct{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", count=" + count +
                "}";
    }
}
