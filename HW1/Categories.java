package HW1;

import java.util.ArrayList;

public class Categories {
    private  String name;
    private ArrayList<Product> products;
    public Categories(String name){
        this.name = name;
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
    public void addProduct(Product product){
        products.add(product);
    }
}
