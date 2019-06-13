package rashkevich.lesson6;

public class Task3 {
    public static void main(String[] args){
        int arr[]={1,1,4,6,1,10,7,8,10,1,4,4,4,7,10,10};
        int repeat[]=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    repeat[i]++;
                }
            }
        }

        int maxRepeat=0;
        for (int i=0;i<repeat.length;i++){
            if (maxRepeat<repeat[i]){
                maxRepeat=repeat[i];
            }
        }
        System.out.println("Максимальное количество повторений числа:"+maxRepeat);

        String str[]=new String[arr.length];
        for (int i=0;i<arr.length;i++){
            str[i]=String.valueOf(arr[i]);
            //System.out.print(str[i]+" ");
        }

        for (int i=0;i<str.length;i++){
            if (repeat[i]<maxRepeat){
                str[i]="-";
            }
        }

        for (int i=1;i<str.length;i++){
            for (int j=i;j<str.length;j++){
                if (str[i-1].equals(str[j])){
                    str[j]="-";
                }
            }
        }
        for (int i=0;i<str.length;i++){
            if (!str[i].equals("-")){
                System.out.print(str[i]+" ");
            }
        }

    }
}
