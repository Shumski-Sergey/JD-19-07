package dkuleshov.Lesson4;

public class lesson41 {
    public static void main (String[] Args){
        String text = "Необходимо посчитать количество запятых и других знаков препинания в данном предложении, и посчитать их колличество.";
        System.out.println("Необходимо посчитать количество запятых и других знаков препинания в данном предложении, и посчитать их колличество.");
        int before = text.length();
        int after = text.replaceAll("[,.]", "").length();
        System.out.println("Количество знаков препинания в тексте: " + (before - after));
    }
    }

