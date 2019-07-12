package rashkevich.lesson16.Taskb3;

public class CallCenterRunner {
    public static void main(String[] args){
        int userCount=20;
        CallCenter callCenter=new CallCenter(2);
        for (int i=0;i<userCount;i++){
            User user=new User(i, callCenter);
            Thread t=new Thread(user);
            t.start();
        }
    }
}
