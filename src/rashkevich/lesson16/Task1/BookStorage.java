package rashkevich.lesson16.Task1;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class BookStorage {
    private LinkedList<Book> books;

    public BookStorage(){
        books=new LinkedList<>();
    }

    public void add(Book book){
        books.add(book);
    }

    public void printBookStorage(){
        if(books.size()>0){
            System.out.println("Storage books:");
            books.stream().forEach(s->System.out.println(s.getName()+" "+s.getPlaceToRead()));
            System.out.println("==============");
        }
    }

    public Book take(Book book){
        if(!books.remove(book)){
            book=new Book("no","no");
        }
//        Book b1=book;
//        if (!books.contains(book)){
//        book=new Book("no","no");
//        }
//        if (books.size()!=0){
//            int i=1;
//            int countWaiting=0;
//            while((i==1)||(countWaiting<5)){
//                try {
//                    if (books.contains(b1)){
//                    books.remove(b1);
//                    book=b1;
//                    }
//                    i=0;
//                } catch (NoSuchElementException e){
//                    System.out.println("Wait for books");
//                   // book=new Book("no","no");
//                    countWaiting++;
//                }
//            }
//        }
////        else {
//            System.out.println("Wait for books");
//            book=new Book("no","no");
//        }
        return book;
    }
}
