package HW1;

import java.util.ArrayList;

public class Main {
    /**
     * @apiNote 1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
     * 2)Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
     * 3)Создать класс Basket, содержащий массив купленных товаров.
     * 4)Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов класса User.
     * 5)Вывести на консоль каталог продуктов. (все продукты магазина)
     * 6)Вывести на консоль покупки посетителей магазина.
     * (После покупки у пользователя добавляется товар, а из магазина - удаляется)
     * @param args
     */
    public static void main(String[] args){
        Shop shop = new Shop();
        Categories category1 = new Categories("Продукты");
        category1.addProduct(new Product("Молоко", 86, 6.0));
        category1.addProduct(new Product("Сыр", 700, 8.0));
        category1.addProduct(new Product("Колбаса", 250, 5.0));
        category1.addProduct(new Product("Баранки к чаю", 150, 4.5));

        Categories category2 = new Categories("Текстиль");
        category2.addProduct(new Product("Шторы", 500, 7.0));
        category2.addProduct(new Product("Скатерть на стол", 200, 6.0));
        category2.addProduct(new Product("Полотенце банное", 400, 8.0));

        shop.addCategories(category1);
        shop.addCategories(category2);
        shop.printCatalog();

        User user1 = new User("Антонио", "qwerty");
        User user2 = new User("Петрович", "potato");
        User user3 = new User("Тирентий", "kol23");

        user1.getBasket().addProduct(category1.getProducts().get(2));
        user2.getBasket().addProduct(category2.getProducts().get(0));
        user3.getBasket().addProduct(category1.getProducts().get(0));
        category1.getProducts().remove(2);
        category1.getProducts().remove(0);
        category2.getProducts().remove(0);

        System.out.println(user1.getLogin() + " Купил: ");
        ArrayList<Product> user1Products = user1.getBasket().getProducts();
        for(Product product: user1Products){
            System.out.println(product.getName() + " "
                    + product.getPrice() + " " + product.getRating());
        }
        System.out.println(user2.getLogin() + " Купил: ");
        ArrayList<Product> user2Product = user2.getBasket().getProducts();
        for (Product product: user2Product){
            System.out.println(product.getName() + " "
                    + product.getPrice() + " " + product.getRating());
        }
        System.out.println(user3.getLogin() + " Купил: ");
        ArrayList<Product> user3Product = user3.getBasket().getProducts();
        for (Product product: user3Product){
            System.out.println(product.getName() + " "
                    + product.getPrice() + " " + product.getRating());
        }
        shop.printCatalog();
    }
}
