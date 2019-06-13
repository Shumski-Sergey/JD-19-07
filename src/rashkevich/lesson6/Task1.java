package rashkevich.lesson6;

public class Task1 {
    public static void main(String[] args){
        int arr[]={2,4,6,1,6,9};
        int max=arr[0];
        int min=arr[0];
        int sum=0;
        for (int i=0;i<arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
            }
            if (min>arr[i]){
                min=arr[i];
            }
            sum=sum+arr[i];
        }
        sum=sum-min-max;
        System.out.println("min="+min+" max="+max+ " sum="+sum);

    }
}
