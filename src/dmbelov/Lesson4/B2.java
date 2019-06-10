package dmbelov.Lesson4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B2 {
    public static void main(String[] args) {

        //2. Выбрать последовательность неповторяющихся символов в алфавитнои порядке.Пробелы нужно игнорировать
        String string1 = "poqwoieruytjhfg";

        Pattern pattern = Pattern.compile("^([a]?\\s?[b]?\\s?[c]?\\s?[d]?\\s?[e]?\\s?[f]?\\s?[g]?\\s?"+
                "[h]?\\s?[i]?\\s?[j]?\\s?[k]?\\s?[l]?\\s?[m]?\\s?[n]?\\s?[o]?\\s?[p]?\\s?[q]?\\s?[r]?\\s?" +
                "[s]?\\s?[t]?\\s?[u]?\\s?[v]?\\s?[w]?\\s?[x]?\\s?[y]?\\s?[z]?\\s?)$");
        Matcher matcher = pattern.matcher(string1);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
