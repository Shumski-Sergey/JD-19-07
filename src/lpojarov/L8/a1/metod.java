package lpojarov.L8.a1;

public class metod {

        public static <E>void sid (String s,E[]arr){
            E[] a=arr;
            MyArray<E> sid=new MyArray<E>();
            sid.setArr(a);
            System.out.print(s+" ");
            for (int i = 0; i <sid.getLength();  i++)
                System.out.print(sid.getArrIndex(i)+" ");
            System.out.println();
        }

        public static void main(String[] args) {
            String[] f={"bla"};
            sid("Strng",f);
            Integer[] intr ={1,2,3,4,5,6};
            sid("Integer",intr);
            Double[]ad={1.2,1.3,1.4};
            sid("Double",ad);
        }


    }


