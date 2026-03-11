public class Main {
    public static void main(String[] args) {

        ModulNotificari modul = ModulNotificari.getInstance();

        modul.abonarePacient("Ion");
        modul.abonarePacient("Maria");
        modul.abonarePacient("Andrei");

        modul.trimiteNotificare("A aparut un virus nou in oras!");
    }
}