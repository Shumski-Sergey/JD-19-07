package dmbelov.Lesson10.Lab.uniqueChars;

import java.util.HashMap;
import java.util.Map;

public class UniqueChars {

        private Map<Character, Integer> map = new HashMap<>();
        private Map<Character, Integer> mapDigits = new HashMap<>();

        private String text;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        void calculate() {
            for (char c : text.toCharArray()) {
                if (Character.isLetter(c)) {
                    if (map.containsKey(c)) {
                        map.put(c, map.get(c) + 1);
                    } else {
                        map.put(c, 1);
                    }
                }
                if(Character.isDigit(c)) {
                    if (mapDigits.containsKey(c)) {
                        mapDigits.put(c, mapDigits.get(c)+1);
                    } else {
                        mapDigits.put(c, 1);
                    }
                }
            }
        }

        void calculateUpperCaseChars() {
            for (char c : text.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    if (map.containsKey(c)) {
                        map.put(c, map.get(c) + 1);
                    } else {
                        map.put(c, 1);
                    }
                }
            }
        }

        void calculateLowerCaseChars() {
            for (char c : text.toCharArray()) {
                if (Character.isLowerCase(c)) {
                    if (map.containsKey(c)) {
                        map.put(c, map.get(c) + 1);
                    } else {
                        map.put(c, 1);
                    }
                }
            }
        }

            @Override
            public String toString() {
                String result = "";
                for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                    result += "char: " + entry.getKey() +
                            "; count: " + entry.getValue() + "\n";
                }
                for (Map.Entry<Character, Integer> entry : mapDigits.entrySet()) {
                    result += "digit: " + entry.getKey() +
                            "; count: " + entry.getValue() + "\n";
                }

                return result;
            }
}
