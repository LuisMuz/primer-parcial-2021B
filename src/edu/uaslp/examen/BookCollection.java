package edu.uaslp.examen;

import java.util.List;
import java.util.ListIterator;

public class BookCollection {

    private String name;
    private List<Book> books;

    public BookCollection(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> getBooks(){
        return books;
    }

    public int getStars(){
        ListIterator<Book> iterator = books.listIterator();
        int totalStars = 0;

        while(iterator.hasNext()){
            totalStars+= iterator.next().getStars();
        }

        return totalStars/books.size();
    }

}
