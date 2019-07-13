package rashkevich.lesson16.Task1;

public class Book {
    private String name;
    private String placeToRead;

    public Book(String name, String placeToRead){
        this.name=name;
        this.placeToRead=placeToRead;
    }

    public String getName() {
        return name;
    }

    public String getPlaceToRead() {
        return placeToRead;
    }
}
