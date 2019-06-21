package vgorelko.Lesson10.TaskB.UniqueChars;

public class StarterUniqueChars {

    public static void main(String[] args) {

        UniqueChars uniqueChars = new UniqueChars();

        uniqueChars.setText("Проверка текста. Раз, Два, Три!");

        uniqueChars.calculate();

        System.out.println(uniqueChars.getMap());
    }

}
