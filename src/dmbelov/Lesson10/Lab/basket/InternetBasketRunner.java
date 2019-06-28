package dmbelov.Lesson10.Lab.basket;

import java.util.ArrayList;
import java.util.List;

public class InternetBasketRunner {
    public static void main(String[] args) {

        InternetBasket basket = new InternetBasket();
        basket.addProduct("Milk 1L", 2);
        basket.addProduct("Coffee", 1);
        basket.addProduct("Beer", 5);
        System.out.print(basket+"\n");

        basket.removeProduct("Beer");
        System.out.print(basket+"\n");

        basket.updateProductQuantity("Coffee", 3);
        System.out.print(basket+"\n");

        basket.clear();
        System.out.print(basket+"\n");

        basket.addProduct("Beef", 1);
        basket.addProduct("Sauce", 1);
        System.out.print(basket+"\n");

        List<String> products = new ArrayList<>();
        products = basket.getProducts();
        System.out.print(products+"\n");

        System.out.print(basket.getProductQuantity("Beef"));
    }
}
