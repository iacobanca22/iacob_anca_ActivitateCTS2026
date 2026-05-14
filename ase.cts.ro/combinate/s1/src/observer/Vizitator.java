package observer;

public class Vizitator implements Observer{
    private String nume;
    private boolean scrisoareAcceptare;

    public Vizitator(String nume, boolean scrisoareAcceptare) {
        this.nume = nume;
        this.scrisoareAcceptare = scrisoareAcceptare;
    }

    @Override
    public void permiteIntrarea(String mesaj) {
        if (scrisoareAcceptare) {
            System.out.println(nume + " are scrisoare de acceptare — " + mesaj);
        } else {
            System.out.println(nume + " nu are scrisoare de acceptare — acces refuzat!");
        }

    }

    public boolean isScrisoareAcceptare() {
        return scrisoareAcceptare;
    }
}
