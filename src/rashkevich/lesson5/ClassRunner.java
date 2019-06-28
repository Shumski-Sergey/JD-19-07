package rashkevich.lesson5;

public class ClassRunner {
    public static void main(String[] args){
        ClassOne one=new ClassOne("one");
        ClassOne two=new ClassOne("two");
        System.out.println(one.getName());
        System.out.println(two.getName());
    }
}
