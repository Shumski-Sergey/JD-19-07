package tolifer;



public class zadB1 {
    public static void main (String [] args){
        int a;
        int max = 155;
        

        a = (int) Math.random();

        if(5<=a&&a<=155){
            if(25<a&&a<100){
                System.out.println(a + " попало");
            }else {
                System.out.println(a + " не попало");
            }
        }else {
            System.out.println(a + " введенное число не входит в интервал [5,155]");
        }
    }
}
