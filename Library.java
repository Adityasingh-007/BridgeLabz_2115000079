class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    void displayInfo() {}
}

class Author extends Book {
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    void displayInfo() {
        System.out.println("Book: " + title + " Year: " + publicationYear);
        System.out.println("Author: " + name + " Bio: " + bio);
    }
}

public class Library {
    public static void main(String[] args) {
        Author author = new Author("Java Programming", 2020, "John Doe", "An expert in Java.");
        author.displayInfo();
    }
}