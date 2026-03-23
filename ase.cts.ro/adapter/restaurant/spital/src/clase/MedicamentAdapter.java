package clase;

public class MedicamentAdapter extends MedicamentSpital implements MedicamentFarmacie{


    public MedicamentAdapter(String nume) {
        super(nume);
    }

    @Override
    public void cumparaMedicament() {

        super.achizitioneazaMedicament();
    }
}
