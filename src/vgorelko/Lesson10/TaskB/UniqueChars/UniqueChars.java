package vgorelko.Lesson10.TaskB.UniqueChars;

import java.util.*;

public class UniqueChars {

    private Map<Character, Integer> map = new HashMap<>();

    public Map<Character, Integer> getMap() {
        return map;
    }

    private String text;

    public String getText() {

        return text;

    }

    public void setText(String text) {

        this.text = text;

    }

    public void calculate() {

        for (char c : text.toCharArray()) {

            if (Character.isLetter(c)) {

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

        return result;

    }


}