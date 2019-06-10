package sgolovenchik.Lesson4;

public class B1 {
    public static void main(String[] args) {
        long a = System.currentTimeMillis();//снимаем текущее время
        String s = "Чапаев на коне едет в штаб.";
        for (int i = 0; i < 20000; i++) {//первый цикл сложения строк через concat
            s = s.concat(" Цок-цок.");
        }
            long b = System.currentTimeMillis();//снимаем время после цикла
            System.out.println("Сложение строк через оператор concat: "+(b - a)+" милисек.");

        System.out.println(s);
        System.out.println("Чапаев приехал в штаб.");

        //измеряем время второго метода сложения строк:
        long c = System.currentTimeMillis();
        StringBuilder m = new StringBuilder("Чапаев на коне едет в штаб.");
        for (int i = 0; i < 20000; i++) {//второй цикл сложения строк
            m.append(" Цок-цок.");
        }
        long d = System.currentTimeMillis();
        System.out.println("Сложение строк через StringBuilder и append : "+(d - c)+" милисек.");

        System.out.println(m);
        System.out.println("Чапаев приехал в штаб.");
        //на домашнем компе при цикле 20000 показало 2973 и 3 мсек. Второй метод в 1000 раз быстрее.
    }
}

