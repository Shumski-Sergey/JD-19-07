package vgorelko.Lesson10.TaskB.Basket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;


public class BasketControler {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    void control() throws IOException {

        BasketImpl basketImpl = new BasketImpl();

        String nextWork = "";

        while (!nextWork.equals("нет")) {

            System.out.println("Введите номер пункта (из представленного перечня) для работы с продуктами!");
            System.out.println("1 - положить продукцию в корзину");
            System.out.println("2 - удалить продукт из карзины");
            System.out.println("3 - поменять количество продукции в корзине");
            System.out.println("4 - очистить корзину с продуктами");
            System.out.println("5 - узнать перечень продукции в корзине");
            System.out.println("6 - узнать количество конкретной продукции в корзине");
            System.out.println("7 - просмотреть, что сейчас находится в корзине!");

            String num1 = reader.readLine();
            int num = Integer.parseInt(num1);

        switch (num) {
            case 1:

                System.out.println("Укажите название продукта, который нужно положить в корзину!");
                String product = reader.readLine();
                System.out.println("Укажите количество продукта, которое нужно положить в корзину!!");
                String count1 = reader.readLine();
                int count = Integer.parseInt(count1);

                basketImpl.addProduct(product, count);

                break;
            case 2:

                System.out.println("Укажите название продукта для удаления из корзины!");
                String productRemove = reader.readLine();

                basketImpl.removeProduct(productRemove);

                break;
            case 3:

                System.out.println("Укажите название продукта, для которого нужно поменять количество в корзине!");
                String productChange = reader.readLine();
                System.out.println("Укажите новое количество продукта!");
                String count1Change = reader.readLine();
                int countChange = Integer.parseInt(count1Change);

                basketImpl.updateProductQuantity(productChange, countChange);

                break;
            case 4:

                System.out.println("Корзина очищена!");
                basketImpl.clear();

                break;
            case 5:

                System.out.println("В корзине находится следующий перечень продукции: " + basketImpl.getProducts());

                break;
            case 6:

                System.out.println("Укажите название продукта, для которого нужно узнать количество в корзине!");
                String countProduct = reader.readLine();
                System.out.println(basketImpl.getProductQuantity(countProduct));

                break;
            case 7:

                System.out.println("В корзине находится: ");
                for (Map.Entry entry : basketImpl.map.entrySet()) {

                    System.out.println("Продукт: " + entry.getKey() + ". В количестве: " + entry.getValue() + " ШТ.");

                }

                break;

            default:

                break;

        }
        System.out.println();
        System.out.println("Желаете продолжить работу с другими пунктами?");
        System.out.println("да - для продолжения работы с другими пунктами.");
        System.out.println("нет - выход из программы.");
        nextWork = reader.readLine();
    }


    }

}
