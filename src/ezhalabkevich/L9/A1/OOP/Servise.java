package ezhalabkevich.L9.A1.OOP;

public class Servise extends Students {

    public static void allmarks(Students s){
        System.out.println("Все оценки "+s.name);
        for (Object o:s.marks) {
            System.out.print(o+" ");
        }
        System.out.println(" ");
    }
    public static void goodmarks(Students s){
        System.out.println("Хорошие оценки "+s.name);
        for (Object o:s.marks) {
            if ((int)o>3){
            System.out.print(o+" ");}

        }
    }
}
