package dmbelov.Lesson8.A1;

public class BoxRunner {
    public static void main(String[] args) {
        String [] mas = {"I", "can", "hear", "you"};
        Box<String> box = new Box<>();
        box.setMas(mas);
        int index = 3;
        System.out.print(box.getMas(index));
    }
}
