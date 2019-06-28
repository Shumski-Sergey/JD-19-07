package rashkevich.lesson10;

import java.util.List;

public class BusketRunner {
    public static void main(String[] args){
        InternetMarketBasket basket=new InternetMarketBasket();
        basket.addProduct("Beer", 3);
        basket.addProduct("Souce", 2);
        basket.addProduct("Bread", 1);
        basket.addProduct("Fish",5);
        System.out.println("Beer quantity="+basket.getProductQuantity("Beer"));
        List<String> list=basket.getProducts();
        for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));
        }
        basket.updateProductQuantity("Beer",8);
        basket.removeProduct("Fish");
        list=basket.getProducts();
        System.out.println("----------");
        list.forEach(s -> System.out.println(s+" "+basket.getProductQuantity(s)));
    }
}
