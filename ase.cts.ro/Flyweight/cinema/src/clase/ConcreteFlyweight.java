package clase;

public class ConcreteFlyweight implements LocCinema{
    private String tipLoc;
    private int rand;

    public ConcreteFlyweight(String tipLoc, int rand) {
        this.tipLoc = tipLoc;
        this.rand = rand;
    }

    @Override
    public String toString() {
        return "ConcreteFlyweight{" +
                "tipLoc='" + tipLoc + '\'' +
                ", rand=" + rand +
                '}';
    }

    @Override
    public void detaliiRezervare(DetaliiRezervare detalii) {
        System.out.println(
                "Loc rand " + rand +
                        ", tip " + tipLoc +
                        " rezervat de " + detalii.getNumeClient() +
                        " la ora " + detalii.getOraRezervarii());
    }
    }


