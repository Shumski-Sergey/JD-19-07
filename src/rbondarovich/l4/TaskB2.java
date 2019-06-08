package rbondarovich.l4;

import java.util.ArrayList;

public class TaskB2 {
    public static void main(String[] args) {
        String line = "abc def fmnop absd абвэюя";
        String line2 = line.replaceAll(" ", "");
        System.out.println(line2);
        ArrayList<StringBuilder> list = new ArrayList<>();

        StringBuilder sequence = new StringBuilder("");

        for (int i = 0; i < line2.length()-1; i++) {

// нахожу последовательность и собираю ее в строку sequence
            if (i == 0) sequence.append(line2.charAt(i));
            if (line2.charAt(i) < line2.charAt(i + 1) && sequence.toString().indexOf(line2.charAt(i + 1)) == -1){  // Так же нужно добавить игнор регистра букв, но я уже хочу спать
                if(sequence.length()==0) sequence.append(line2.charAt(i));
                sequence.append(line2.charAt(i + 1));
           // System.out.println(sequence);
            }

// когда последовательность обрывается заношу ее в лист и обнуляю строку
            else if (sequence.length() > 1) {
//если использовать более быстрый StringBuilder (по сравнению со String), то чтобы не терять строку при обнулении "sequence.delete(0,sequence.length());"
// нужно создать новый объект и занести нужное значение в него "new StringBuilder(sequence)"
                list.add(new StringBuilder(sequence));
                sequence.delete(0,sequence.length());
            }
        }
        for(StringBuilder x : list){
            System.out.println(x);
        }
    }
}
