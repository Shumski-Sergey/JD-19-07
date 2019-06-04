package rashkevich.lesson3;

public class TaskB1 {
    public static void main(String[] args){
        int i=20023143;
        int counter=0;
        String str=""+i;
        String newStr="";

        char chars[]=str.toCharArray();

        int length=str.length();
        for (int j=length-1;j>=0;j--){
            newStr=newStr+chars[j];
            counter++;
            if(counter==3){
                newStr=newStr+" ";
                counter=0;
            }
        }

        char newChars[]=newStr.toCharArray();
        for ( int k=newStr.length()-1;k>=0;k--){

            System.out.print(newChars[k]);
        }
    }
}
