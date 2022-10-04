import java.util.Objects;

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

    public String getFullName() {
        return this.name + "" + this.lastname;
    }


    public String authorInfo() {
        return " Автор: " + getFullName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(lastname, author.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname);
    }
}

