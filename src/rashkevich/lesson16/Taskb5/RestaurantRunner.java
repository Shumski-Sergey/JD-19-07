package rashkevich.lesson16.Taskb5;

public class RestaurantRunner {
    public static void main(String[] args){
        final int CASH_BOX_COUNT=3;
        Restaurant restaurant=new Restaurant(CASH_BOX_COUNT);
        final int VISITOR_COUNT=90;
        for (int i=0;i<VISITOR_COUNT;i++){
            Visitor visitor=new Visitor(i,restaurant);
            Thread t=new Thread(visitor);
            t.start();
        }
    }

}
