package testing;

public class Author {
    String name;
    String surname;
    int rating;

    public Author(String name, String surname, int rating) {
        this.name = name;
        this.surname = surname;
        this.rating = rating;
    }

    public boolean includes(String word) {
        return name.contains(word) || (surname.contains(word));
    }

}
