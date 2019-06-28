package rashkevich.lesson8.TaskB1andB2;

public class ConvertationRunner {
    public static void main(String... args){
        Integer a[]={1,2,3,4,5,6};
        String str[]={"a","b","c","d","e","f"};
        Convertation<Integer> con=new Convertation<Integer>();
        con.set(a);
        con.convert();
        con.print();
        System.out.println();
        System.out.println("Max number="+con.getMax());
        System.out.print("Min number="+con.getMin());
        System.out.println();

        Convertation<String> conStr=new Convertation<String>();
        conStr.set(str);
        conStr.convert();
        conStr.print();
        System.out.println();
        //System.out.print("Max number="+conStr.getMax()); будет error

    }
}
