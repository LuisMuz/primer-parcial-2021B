package edu.uaslp.examen;
import java.util.List;
import java.util.ListIterator;

public class BookCollectionManager {

    private List<BookCollection> collections;

    public BookCollection createCollection(String name){
        collections.add(new BookCollection(name));
        return collections.get(collections.size()-1);
    }

    public BookCollection getCollectionByName(String name){
        ListIterator<BookCollection> iterator = collections.listIterator();

        while(iterator.hasNext()){
            BookCollection compareCollection = iterator.next();
            if(compareCollection.getName().equals(name)){
                return compareCollection;
            }
        }

        return null;
    }

    public void deleteCollectionByName(String name){

        ListIterator<BookCollection> iterator = collections.listIterator();
        int index = 0;
        while(iterator.hasNext()){
            BookCollection compareCollection = iterator.next();
            if(compareCollection.getName().equals(name)){
                collections.remove(index);
            }
            index++;
        }
    }

    public void addBookToCollection(String collectionName, Book book){
        BookCollection newCollection = new BookCollection(collectionName);
        newCollection.addBook(book);
        collections.add(newCollection);
    }

    public List<String> getCollectionsNames(){
        List<String> collectionNames = new List<String>;

        ListIterator<BookCollection> iterator = collections.listIterator();
        while(iterator.hasNext()){
            BookCollection compareCollection = iterator.next();
            collectionNames.add(compareCollection.getName());

        }

        return collectionNames;
    }

}
