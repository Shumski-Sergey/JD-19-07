package lpojarov.L11.A_1;

import java.util.Map;

public class getQuerry {
    public static String getQuery(Map<String, String> params) {
        StringBuilder s = new StringBuilder();
        for (Map.Entry<String, String> pair : params.entrySet()) {
            if (pair.getValue() != null) {
                s.append(pair.getKey() + " = " + pair.getValue() + " and ");
            }
        }
        s.delete(s.toString().length() - 5, s.toString().length());
        return s.toString();
    }
}
