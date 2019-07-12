package rashkevich.lesson16.Taskb3;

import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;

public class CallCenter {
    private int countOperators;
    private ConcurrentLinkedQueue<Operator> operatorList;

    public CallCenter(int countOperators) {
        this.countOperators = countOperators;
        operatorList=new ConcurrentLinkedQueue<Operator>();
        for (int i=0;i<countOperators;i++){
            Operator operator=new Operator(i);
            operatorList.add(operator);
        }
    }

    public ConcurrentLinkedQueue<Operator> getOperatorList() {
        return operatorList;
    }

}
