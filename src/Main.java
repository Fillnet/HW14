public class Main {
    public static void main(String[] args) {
        Author tomCruze = new Author("Tom ", "Cruze ");
        Author kotBegemoth = new Author("Kot ", "Begemoth ");
        Book voinaMirov = new Book("Voina Mirov", tomCruze, 2020);
        Book masterMargarita = new Book("Master & Margarita", kotBegemoth, 4987);
        System.out.println("Книга: " + voinaMirov.getTitle() + " Автор: " +
                voinaMirov.getAuthor().getName() + voinaMirov.getAuthor().getLastname() +
                " Год издания: " + voinaMirov.getPublicationYear());
        System.out.println("Книга: " + masterMargarita.getTitle() + " Автор: " +
                masterMargarita.getAuthor().getName() + masterMargarita.getAuthor().getLastname() +
                " Год издания: " + masterMargarita.getPublicationYear());
        masterMargarita.setPublicationYear(1987);
        System.out.println("Книга: " + masterMargarita.getTitle() + " Автор: " +
                masterMargarita.getAuthor().getName() + masterMargarita.getAuthor().getLastname() +
                " Год издания: " + masterMargarita.getPublicationYear());
    }

}