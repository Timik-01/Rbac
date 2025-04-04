import java.util.HashSet;
import java.util.Set;

public class User {
    private String name;
    private Set<Role> roles;

    public User(String name) {
        this.name = name;
        this.roles = new HashSet<>();
    }

    public void addRole(Role role) {this.roles.add(role);}
    public void removeRole(Role role) {this.roles.remove(role);}
    public Set<Role> getRoles() {return this.roles;}
    public String getName() {return this.name;}
}
