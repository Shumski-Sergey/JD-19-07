package rashkevich.lesson4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//2. Выбрать последовательность неповторяющихся символов в алфавитнои порядке.Пробелы нужно игнорировать

public class TaskB2v2 {
    public static void main(String[] args){
        String text="prohijkcess finished with abcd exit code 0";
        String text2=text.replace(" ","");
        System.out.println(text2);
        char chars[]=text2.toCharArray();
        for (int i=0;i<chars.length;i++){
            char lastChar=chars[i];
            String str=String.valueOf(chars[i]); //p
            //System.out.println("1.-"+str);
            if ((i+1)<chars.length){
                for (int j=i+1;j<chars.length;j++){
                    if(chars[j-1]<chars[j]){
                        if(chars[j]<'z'){
                            if(lastChar<chars[j]){
                                str=str+chars[j];
                                lastChar=chars[j];
                            }
                        }
                    }
                }
                System.out.println(str);
            }

        }
    }
}
