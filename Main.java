public class Main {
    public static void main(String[] args) {
        User goll = new User("name");
        User gol = new User("nam");
        User go = new User("na");

        Role role = new Admin();
        Role rol = new EingeschränkterUser();
        Role ro = new NormalUser();

        goll.addRole(role);
        gol.addRole(rol);
        go.addRole(ro);
    }
}
