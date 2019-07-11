package rashkevich.lesson16.Task1v2;

import java.util.LinkedList;

public class User implements Runnable{
    private Storage storage;
    private LinkedList<Book> userListBook;
    private LinkedList<Integer>  listBookToTake;
    private int id;

    public User(Storage storage, int id) {
        this.storage = storage;
        this.userListBook = new LinkedList<Book>();
        this.listBookToTake = new LinkedList<Integer>();
        this.id = id;
    }

    public void wantBookToTake(Integer id){
        listBookToTake.add(id);
    }

    @Override
    public void run() {
        takeBooks();
        returnBooks();
    }

    public void takeBooks(){
        for (Integer id:listBookToTake){
           Book book=null;
           int flag=0;
           int count=0;
           while( flag!=1){
               book=storage.get(id);
               if(book!=null){
                    userListBook.add(book);
                    System.out.println("user "+this.id+" takes book "+book.getId()+" canTakeHome:"+book.isCanTakeHome());
                    flag=1;
                    //listBookToTake.remove(id);
               } else {
                   System.out.println("user "+this.id+" tries to take book "+id);
                    count++;
                    if (count==3){
                        System.out.println("user "+this.id+" cannot take book "+id+ " and goes away");
                        flag=1;
                        //listBookToTake.remove(id);
                    }
               }
           }
        }
    }

    public void returnBooks(){
        for (Book book:userListBook){
            if(!book.isCanTakeHome()){
                storage.add(book);
                userListBook.remove(book);
                System.out.println("user "+this.id+" return book "+book.getId()+" canTakeHome:"+book.isCanTakeHome());
            }
        }
    }

    public void print(){
        System.out.println("User "+id+"has books:");
        userListBook.stream().forEach(System.out::println);
    }
}
