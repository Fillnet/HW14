import java.util.Objects;

public class Book {
    private final String title;
    private final Author author;
    private int publicationYear;
    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    public String getTitle() {
        return this.title;
    }
    public Author getAuthor() {
        return author;
    }
    public int getPublicationYear() {
        return this.publicationYear;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    public String bookInfo() {
        return "Книга: " + this.title + " Автор: " + author.authorInfo() + " Год публикации: " + this.publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicationYear);
    }
}

