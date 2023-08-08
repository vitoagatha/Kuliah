class ManagerApp {
    public static void main(String[] args) {

        var manager = new Manager();
        manager.name = "Mac";
        manager.sayHello("Alister");

        var vp = new VicePresident();
        vp.name = "Widodo";
        vp.sayHello("Joko");
    }
}
