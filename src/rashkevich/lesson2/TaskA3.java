package rashkevich.lesson2;

public class TaskA3 {
    public static void main(String[] args){
        int a=0;
        int b=4;
        int c=1;
        int m1=0;
        int m2=0;
        int m3=0;

        if ((a>=b)&&(a>=c)){
            m3=a;
        } else if ((b>=c)&&(b>=a)){
            m3=b;
        } else if ((c>=b)&&(c>=a)){
            m3=c;
        }

        if ((a<b)&&(a<c)){
            m1=a;
        } else if ((b<c)&&(b<a)){
            m1=b;
        } else if ((c<b)&&(c<a)){
            m1=c;
        }

        if (((a<b)&&(b<c))||((a>b)&&(b>c))){
            m2=b;
        } else if (((b<c)&&(c<a))||((b>c)&&(c>a))){
            m2=c;
        } else if (((c<a)&&(a<b))||((c>a)&&(a>b))){
            m2=a;
        }

        System.out.println(m1+" "+m2+" "+m3);
    }
}
