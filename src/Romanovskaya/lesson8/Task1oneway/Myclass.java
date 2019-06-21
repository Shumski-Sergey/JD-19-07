package romanovskaya.lesson8.Task1oneway;


public class Myclass {



    public static <E> void sid (String s, E[] arr){

        E[] a = arr;
        TaskA1 <E> sid = new TaskA1<E>();
        sid.setArr(a);

        sid.print();
        System.out.println();

        System.out.println(sid.getArrIndex(2) + " ");

        System.out.println();

    }

    public static void main(String[] args) {
        String[] s = {"HELLO", "WORLD", "MY","DEAR","PLANET"};
        sid("String", s);

        Integer[] intr = {1, 2, 3,4,5,6,7};
            sid("Integer", intr);

            Double [] ad = {1.2, 1.5, 6.7};
                sid("Double", ad);
            }
        }
