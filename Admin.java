
import java.util.Objects;

public class Admin implements Role{
    @Override
    public String getName() {
        return "Admin";
    }

    @Override
    public String getDescription() {
        return "Alle Rechte vorbehalten";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return Objects.equals(getName(), ((Admin) obj).getName());
    }

    @Override
    public int hashCode() {return Objects.hash(getName());}
}
