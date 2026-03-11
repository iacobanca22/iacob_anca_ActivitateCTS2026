package builder;

import builder.BuilderMasa;
import builder.BuilderMasaRestaurant;

public class Ospatar {

    private BuilderMasa builder;

    public Ospatar(BuilderMasa builder) {
        this.builder = builder;
    }

    public void pregatesteMasa() {

        builder.curataMasa();
        builder.aseazaServetele();
        builder.aseazaTacamuri();
        builder.invitaPersoane();
    }
}