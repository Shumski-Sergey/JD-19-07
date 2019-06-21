package romanovskaya.lesson8;

public class Main {

    public static void main(String[] args) {
            String arrString[] = {"Hello","World","How", "Are", "You"};
            Integer arrInteger[] = {1,2,3,4,5,6,7,8,9,10};

            GenericsArray<String> first = new GenericsArray<String>(arrString);
            first.print();
            System.out.println("");
            System.out.println(first.getByIndex(2));

            GenericsArray<Integer> second = new GenericsArray<Integer>(arrInteger);
            second.print();
            System.out.println("");
            System.out.println(second.getByIndex(2));

    }
}
