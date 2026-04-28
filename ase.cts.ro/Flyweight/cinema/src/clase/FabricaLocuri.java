package clase;
import java.util.HashMap;

public class FabricaLocuri {
    private HashMap<String, LocCinema> locuri;

    public FabricaLocuri() {
        locuri = new HashMap<String, LocCinema>();

    }

    public LocCinema getLoc(int rand, String tipLoc) {


        String cheie = rand + "_" + tipLoc;

        LocCinema loc = locuri.get(cheie);


        if (loc == null) {
            loc = new ConcreteFlyweight(tipLoc, rand);
            locuri.put(cheie, loc);

            System.out.println("Loc creat: " + cheie);
        }


        return loc;

    }
    public int getNumarLocuri() {
        return locuri.size();
    }
}
