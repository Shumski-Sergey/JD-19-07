package vgorelko.Lesson10.TaskB.Basket;

import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.*;

public class BasketImpl implements Basket {

    Map<String, Integer> map = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        map.put(product, quantity);
    }

    @Override
    public void removeProduct(String product) {
        map.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        map.put(product, quantity);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public List<String> getProducts() {

        List<String> listProduct = new ArrayList<>();

        for(Map.Entry entry : map.entrySet()) {

            listProduct.add((String) entry.getKey());

        }

        return listProduct;
    }

    @Override
    public int getProductQuantity(String product) {
        int x = map.get(product);
        return x;
    }
}
