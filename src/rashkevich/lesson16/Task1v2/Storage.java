package rashkevich.lesson16.Task1v2;


import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Optional;

public class Storage {
    private LinkedList<Book> books;

    public Storage() {
        books=new LinkedList<Book>();
    }

    public boolean add(Book book){
        boolean containBook=false;
        while (!containBook){
            books.add(book);
            if(books.contains(book)){
                containBook=true;
            }
        }
        return containBook;
    }

    public Book get(int idBook){
        Book b1=null;
        int flag=0;
        int count=0;
        while(flag!=1) {
            try {
                Optional<Book> result = books.stream().filter(s -> s.getId() == idBook).findFirst();
                b1 = result.get();
                books.remove(b1);
                //System.out.println("Book " + b1.getId() + " is taken");
                flag=1;
            } catch (NoSuchElementException| ConcurrentModificationException e) {
                //System.out.println("No such book " + idBook);
                count++;
                if (count==5){
                    flag=1;
                }
            }
        }
        return b1;
    }

    public void println(){
        System.out.println("Book storage has books:");
        books.stream().forEach(System.out::println);
    }
}
