public class Author {
    private final String name;
    private final String lastname;

    public Author(String name, String lastName) {
        this.name = name;
        this.lastname = lastName;
    }

    public String getName() {
        return this.name;
    }

    public String getLastname() {
        return this.lastname;
    }
}

