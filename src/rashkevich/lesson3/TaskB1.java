package rashkevich.lesson3;

public class TaskB1 {
    public static void main(String[] args){
        int i=20023143;
        int counter=0;
        String str=""+i;
        String newStr="";
        char chars[]=str.toCharArray();
        int length=str.length();
        for (int j=0;j<length;j++){
            counter=counter++;
            if(counter==3){
                newStr=" e"+newStr;
            }
            newStr=newStr+chars[j];
            System.out.println(newStr);
        }
    }
}
