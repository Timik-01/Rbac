public class Main {
    public static void main(String[] args) {
        User thomas = new User("Thomas");
        User nahim = new User("Nahim");
        User bardan = new User("Bardan");

        Resource docG = new Resource("DocGesichert");
        Resource docN = new Resource("DocNormal");
        Resource docX = new Resource("DocX");

        Role admin = new Admin();
        Role eUser = new EingeschränkterUser();
        Role nUser = new NormalUser();

        docG.addRole(admin);
        docN.addRole(eUser);
        docX.addRole(nUser);

        thomas.addRole(admin);
        nahim.addRole(eUser);
        bardan.addRole(nUser);

        docG.hasAccess(thomas);
        docN.hasAccess(thomas);
        docX.hasAccess(bardan);

    }
}
