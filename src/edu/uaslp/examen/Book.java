package edu.uaslp.examen;

public class Book {

    private String title;
    private String isbn;
    private String autor;
    private short stars;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public short getStars() {
        return stars;
    }

    public void setStars(short stars) {
        if(stars >= 0 && stars <= 5)
            this.stars = stars;
    }
}
