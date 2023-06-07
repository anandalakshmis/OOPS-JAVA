// Publisher class
class Publisher {
    private String name;

    public Publisher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Book class
class Book {
    private String title;
    private int year;
    private Publisher publisher;

    public Book(String title, int year, Publisher publisher) {
        this.title = title;
        this.year = year;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Year: " + year);
        System.out.println("Publisher: " + publisher.getName());
    }
}

// LiteratureBook class (subclass of Book)
class LiteratureBook extends Book {
    private String author;

    public LiteratureBook(String title, int year, Publisher publisher, String author) {
        super(title, year, publisher);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Author: " + author);
        System.out.println("Category: Literature");
    }
}

// FictionBook class (subclass of Book)
class FictionBook extends Book {
    private String genre;

    public FictionBook(String title, int year, Publisher publisher, String genre) {
        super(title, year, publisher);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Genre: " + genre);
        System.out.println("Category: Fiction");
    }
}

public class Mains {
    public static void main(String[] args) {
        Publisher publisher = new Publisher("ABC Publications");

        // Create literature book
        LiteratureBook literatureBook = new LiteratureBook("Pride and Prejudice", 1813, publisher, "Jane Austen");

        // Create fiction book
        FictionBook fictionBook = new FictionBook("The Great Gatsby", 1925, publisher, "Drama");

        // Display details of literature book
        System.out.println("Literature Book Details:");
        literatureBook.displayDetails();
        System.out.println();

        // Display details of fiction book
        System.out.println("Fiction Book Details:");
        fictionBook.displayDetails();
    }
}
