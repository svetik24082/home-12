import java.util.Objects;

public class Author {
    private final String name;
    private final String surname;


    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {

        return name;
    }

    public String getSurname() {

        return surname;
    }


    public String toString() {
        return this.name + " " + this.surname;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this==obj) {
            return true;
        }
        if (!(obj instanceof Author)) {
            return false;
        }
        Author that = (Author) obj;
        return this.name.equals(that.name) && this.surname.equals(that.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}











