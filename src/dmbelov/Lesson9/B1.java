package dmbelov.Lesson9;

//B1.Имеется текст. Следует составить для него частотный словарь

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B1 {
    public static void main(String[] args) throws IOException {
        // Читаю строки из файла
        FileReader fileReader = new FileReader("c:\\Обмен\\text.txt");
        Scanner scanner = new Scanner(fileReader);

        ArrayList<String> arrayList = new ArrayList<>();
        while (scanner.hasNextLine()){
            arrayList.add(scanner.nextLine().toLowerCase()); //все слова привел к маленьким буквам и добавил в список
        }

        fileReader.close();

        // Запихиваю в новый массив каждое слово в отдельности
        ArrayList<String> arrayList1 = new ArrayList<>();
        for (String s: arrayList) {
            Pattern p = Pattern.compile("([a-zA-Z]+)");
            Matcher m = p.matcher(s);
            while (m.find()){
                arrayList1.add(m.group());
            }
        }

        // Считаю сколько раз слово встретилось в тексте
        int count;
        int numberOfMatches;
        ArrayList<Integer> arrayOfMatches = new ArrayList<>(); // список массивов для кол-ва совпадений
        for (int i=0; i<arrayList1.size(); i++){
            count = 1;
            for(int j=i+1; j<arrayList1.size()-1; j++){
                if(arrayList1.get(i).equals(arrayList1.get(j))){
                    count++;
                    arrayList1.remove(j);
                    j--;
                }
            }
            numberOfMatches = count;
            arrayOfMatches.add(i, numberOfMatches);
        }

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        int size = arrayList1.size();
        for (int i=0; i<size; i++) {
            treeMap.put(arrayList1.get(i),arrayOfMatches.get(i));
        }

        // Вывод результата
        for (Map.Entry<String,Integer> map: treeMap.entrySet()) {
            System.out.println(map.getKey() + " repeats " + map.getValue() + " times ");
        }
    }
}