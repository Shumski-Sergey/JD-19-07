package dmbelov.Lesson10.Lab.basket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InternetBasket
    implements Basket {

    private Map<String, Integer> map = new HashMap<>();

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
        map.put(product, map.get(product)+quantity);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public List<String> getProducts() {
        List<String> products = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            products.add(entry.getKey());
        }
        return products;
    }

    @Override
    public int getProductQuantity(String product) {
        return map.get(product);
    }

    @Override
    public String toString() {
        String result = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result += "product: " + entry.getKey() +
                    " quantity: " + entry.getValue() + "\n";
        }
        return result;
    }
}
