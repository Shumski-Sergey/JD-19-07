package ezhalabkevich.L12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Where {
    public static void main(String[] args) {
        /*Сформируй часть запроса WHERE используя StringBuilder. Если значение null, то параметр не должен попадать в запрос.
        Пример: {"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null}
        Результат: "name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'"*/
        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("name", "Ivanov");
        hashMap.put("country", "Ukraine");
        hashMap.put("city", "Kiev");
        hashMap.put("age", null);

        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry : hashMap.entrySet()) { //пробегаем по всему map
            if (entry.getValue() != null) {
                if (stringBuilder.toString().equals("")) {
                    stringBuilder.append(entry.getKey()).append(" = '").append(entry.getValue()).append("'");
                } else {
                    stringBuilder.append(" and ").append(entry.getKey()).append(" = '")
                            .append(entry.getValue()).append("'");
                }
            }

        }
        System.out.println(stringBuilder.toString());

    }
}
