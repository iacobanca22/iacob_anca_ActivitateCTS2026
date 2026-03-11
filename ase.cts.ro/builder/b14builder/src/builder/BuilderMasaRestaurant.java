package builder;

import builder.BuilderMasa;
import obiect.Masa;

public class BuilderMasaRestaurant implements BuilderMasa {

    private Masa masa;

    public BuilderMasaRestaurant() {
        masa = new Masa();
    }

    @Override
    public void curataMasa() {
        masa.setMasaCuratata(true);
    }

    @Override
    public void aseazaServetele() {
        masa.setServetele(true);
    }

    @Override
    public void aseazaTacamuri() {
        masa.setTacamuri(true);

    }

    @Override
    public void invitaPersoane() {
    masa.setPersoaneInvitate(true);
    }

    @Override
    public Masa getMasa() {
        return masa;
    }
}
