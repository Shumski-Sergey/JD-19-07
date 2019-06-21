package romanovskaya.lesson7.TaskA1;

public class S {
    public static void main(String[] args) {
        Mixer mixer = new Mixer();
        Microwave microwave = new Microwave();
        Iron iron = new Iron();
        mixer.Work();
        microwave.Work();
        microwave.Electricity();
        iron.Work();
        iron.Electricity();
    }
}

