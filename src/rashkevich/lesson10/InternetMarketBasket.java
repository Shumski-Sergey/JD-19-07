package rashkevich.lesson10;

import java.util.LinkedHashMap;
import java.util.List;

public class InternetMarketBasket implements Basket{
    private LinkedHashMap<String, Integer> map;



    @Override
    public void addProduct(String product, int quantity) {

    }

    @Override
    public void removeProduct(String product) {

    }

    @Override
    public void updateProductQuantity(String product, int quantity) {

    }

    @Override
    public void clear() {

    }

    @Override
    public List<String> getProducts() {
        return null;
    }

    @Override
    public int getProductQuantity(String product) {
        return 0;
    }
}
