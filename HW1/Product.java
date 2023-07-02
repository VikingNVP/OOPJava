package HW1;

public class Product {
    private String name;
    private Integer price;
    private Double rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Product(String name, Integer price, Double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
}
