package lpojarov.L11.A_1;

import java.util.*;

import static lpojarov.L11.A_1.getQuerry.getQuery;

public class A1 {
    public static void main(String[] args)  {
        getQuerry getQuery=new getQuerry();
        Map<String, String> User = new HashMap<String, String>();
        User.put("name ", " Lex");
        User.put("city ", null);
        User.put("age", "25");
        User.put("Contry", "Belarus");
        //System.out.println(User);

        System.out.print(getQuery(User));


    }



}
