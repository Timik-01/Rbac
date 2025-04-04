import java.util.Objects;

public class EingeschränkterUser implements Role{
    @Override
    public String getName() {
        return "Eingeschränkter User";
    }

    @Override
    public String getDescription() {
        return "Nur lesen";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return Objects.equals(getName(), ((EingeschränkterUser) obj).getName());
    }

    @Override
    public int hashCode() {return Objects.hash(getName());}
}
