package dmbelov.Lesson10.Tasks;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A3 {
    public static void main(String[] args) {
        String s = "123 456 231 546 231 312 4556";
        //String s = "this at This it shit tish you";

        //Выбираю из строки целые слова и добавляю их в список
        Pattern p = Pattern.compile("([1-9A-Za-z]+)");
        Matcher m = p.matcher(s);
        ArrayList<String> list = new ArrayList<>();
        while(m.find()) {
            list.add(m.group().toLowerCase());
        }

        //Добавляю в новый список числовое значение слова
        ArrayList<Integer> listInt = new ArrayList<>();
        for (String str : list) {
            int sumNum = getNumber(str);
            listInt.add(sumNum);
        }

        //Вывод
        for (int i=0; i<listInt.size(); i++) {
            System.out.print(list.get(i));
            for(int j=i+1; j<listInt.size(); j++){
                if(listInt.get(i).equals(listInt.get(j))){
                    System.out.print(" " + list.get(j));
                    listInt.remove(j);
                    list.remove(j);
                    j--;
                }
            }
            System.out.println(" ");
        }
    }

    //Метод вычисления суммы числовых значений букв слова
    private static int getNumber(String str){
        char [] ch = str.toCharArray();
        int number;
        int sum = 0;
        for (char c : ch) {
            number = (int) c;
            sum += number;
        }
         return sum;
    }
}
