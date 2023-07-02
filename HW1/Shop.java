package HW1;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Categories> categories;
    public  Shop(){
        this.categories = new ArrayList<>();
    }
    public void addCategories(Categories category){
        categories.add(category);
    }
    public void printCatalog(){
        for(Categories categories : categories){
            System.out.println(categories.getName());
            ArrayList<Product> products = categories.getProducts();
            for(Product product: products){
                System.out.println("* " + product.getName() + " *");
            }
        }
    }
}
