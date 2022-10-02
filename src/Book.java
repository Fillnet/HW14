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
        return this.author();
    }

    private Author author() {
        return author;// я не понимаю почему без добавления этого метода код не работает, на видео разбора дз этого метода нет
        //было непонятно как использовать класс в классе, чтобы передать все вместе в следующий класс
        // после просмотра видео не понятно почему второй раз даже если полностью переписать код один в один с разбора не работает
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String bookInfo() {
        return "Книга: " + this.title + " Автор: " + this.author.getFullName() + " Год публикации: " + this.publicationYear;
    }

}
