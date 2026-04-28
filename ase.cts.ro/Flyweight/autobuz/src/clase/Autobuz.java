package clase;

public class Autobuz implements Transport{

            private int linie;
            private String tipAutobuz;
            private int capacitate;

    public Autobuz(int linie,String tipAutobuz,int capacitate) {
        this.linie = linie;
        this.capacitate = capacitate;
        this.tipAutobuz = tipAutobuz;
    }

    @Override
    public void detaliiCursa(DetaliiCursa detalii) {
        System.out.println(
                "Autobuz linia " + linie +
                        ", tip " + tipAutobuz +
                        ", capacitate " + capacitate +
                        " pleaca la ora " + detalii.getOraPlecare() +
                        " cu " + detalii.getNrPasageri() + " pasageri");
    }
}
