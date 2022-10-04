public class Main {
    public static void main(String[] args) {
        Author tomCruze = new Author("Tom ", "Cruze ");
        Author kotBegemoth = new Author("Kot ", "Begemoth ");
        Book voinaMirov = new Book("Voina Mirov", tomCruze, 2020);
        Book masterMargarita = new Book("Master & Margarita", kotBegemoth, 2020);
        System.out.println(masterMargarita.bookInfo());
        System.out.println(voinaMirov.bookInfo());
        System.out.println(tomCruze.equals(kotBegemoth));
        System.out.println(voinaMirov.equals(masterMargarita));
        System.out.println(tomCruze.hashCode());
        System.out.println(kotBegemoth.hashCode());
        System.out.println(masterMargarita.hashCode());
        System.out.println(voinaMirov.hashCode());
        masterMargarita.setPublicationYear(1987);
        System.out.println(masterMargarita.bookInfo());
        System.out.println(voinaMirov.equals(masterMargarita));
    }
}



