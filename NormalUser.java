import java.util.Objects;

public class NormalUser implements Role {

    @Override
    public String getName() {
        return "NormalUser";
    }

    @Override
    public String getDescription() {
        return "ausführen und lesen";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return Objects.equals(getName(), ((NormalUser) obj).getName());
    }

    @Override
    public int hashCode() {return Objects.hash(getName());}
}
