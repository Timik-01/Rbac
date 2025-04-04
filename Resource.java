import java.util.HashSet;
import java.util.Set;

public class Resource {
    private String name;
    private Set<Role> roles;

    public Resource(String Name) {
        this.roles = new HashSet<Role>();
        this.name = "";
    }

    public void addRole(Role role) {this.roles.add(role);}
    public void removeRole(Role role) {this.roles.remove(role);}
    public String getName() {return this.name;}
    public Set<Role> getRoles() {return this.roles;}

    public boolean canAccess(User user) {
        for (Role role : user.getRoles()) {
            if (this.roles.contains(role)) {
                return true;
            }
        }
        return false;
    }

    public void hasAccess(User user) {
        System.out.println(user.getName() + " hat Zugriff auf " + this.name + ": " + canAccess(user));
    }

}
