package ezhalabkevich.L3;

public class TaskB1 {
    public static void main(String[] args) {

        String number="12345620023143"; //надо представить число в виде 20 023 143

        int len=number.length(); //узнали длину числа (8)
        int space=len/3; //сколько нужно пробелов (2)
        StringBuffer sb = new StringBuffer(number);
int i;
        for( i=1;i<=space;i++) {
          sb.insert(len-3*i, " ");

        }

        System.out.println(sb);

    }


    }

