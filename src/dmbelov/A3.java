package dmbelov;

import java.util.Arrays;

public class A3 {
    public static void main(String[] args) {

        int [] mas = {5, 8, 1};
        for (int i = 1; i < 3; i++) {
            for(int j=mas.length-1; j>=i; j--) {
                if(mas[j]<mas[j-1]) {
                    int t = mas[j];
                    mas[j] = mas[j - 1];
                    mas[j - 1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
