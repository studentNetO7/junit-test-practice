package testing;

public class Book {
    public String title;
    public int releaseYear;
    public Author author;
    public int pages;

    public Book(String title, int releaseYear, Author author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig() {

        return pages > 500;
    }

    public boolean matches(String word) {

        return title.contains(word) || (author.includes(word));
    }

    public int estimatePrice() {
        int prise = (int) Math.floor((pages * 3) * Math.sqrt(author.rating));
        return Math.max(prise, 250);
    }
}
