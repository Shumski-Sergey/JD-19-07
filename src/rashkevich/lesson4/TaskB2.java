package rashkevich.lesson4;

public class TaskB2 {
    public static void main(String[] args){
        String text="Process finished with exit code 0";
        String text2=text.replace(" ","");
        System.out.println(text2);
        char chars[]=text2.toCharArray();
        for (int i=0; i<chars.length;i++){
            String posled="";
            for (int j=i+1;i<chars.length;j++){
                if (chars[j-1]==chars[j]){
                    posled=posled+chars[j];
                }
            }
            System.out.println(posled);
        }
    }
}
