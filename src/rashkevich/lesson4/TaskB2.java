package rashkevich.lesson4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB2 {
    public static void main(String[] args){
        String text="prohijkcess finished with abcd exit code 0";
        String text2=text.replace(" ","");
        System.out.println(text2);
        char chars[]=text2.toCharArray();
        for (int i=0;i<chars.length;i++){
            char ch=chars[i];
            String str=""+ch;
            String regex="\\s*"+str+"\\s*";
                for (int j=i;j<chars.length;j++){
                    if((int)(ch)<(int)('z')){
                        ch=(char)((int)ch+1);
                        regex=regex+ch+"\\s*";

                        Pattern p=Pattern.compile(regex);
                        Matcher m=p.matcher(text);

                        if(m.find()){
                            System.out.println(m.group(0));
                        }

                    }

                }
        }
    }
}
