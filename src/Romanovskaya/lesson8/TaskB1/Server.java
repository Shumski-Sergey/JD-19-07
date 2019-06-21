package romanovskaya.lesson8.TaskB1;

public class Server<T> implements Converter<T> {


        public static <T> void main (String[]args){

            String arrString[] = {"Hello", "World", "How", "Are", "You"};
            Integer arrInteger[]= {1,2,3,4,5,6,7,8,9,10};
            Server<T> m = new Server<T>();
            System.out.println("Спсок типа String");
            m.simpleArrToList((T[])arrString).forEach(System.out::println);
            System.out.println("Список типа Integer");
            m.simpleArrToList((T[])arrInteger).forEach(System.out::println);

    }
}