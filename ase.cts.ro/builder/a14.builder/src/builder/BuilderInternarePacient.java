package builder;

import builder.obiect.Internare;

public class BuilderInternarePacient implements BuilderInternare {

    private Internare internare;

    public BuilderInternarePacient() {
        internare = new Internare();
    }

    @Override
    public void starePacient() {
        internare.setStarePacient(true);
    }

    @Override
    public void salonDisponibil() {
        internare.setSalonDisponibil(true);
    }

    @Override
    public void fisaInternare() {
        internare.setFisaInternare(true);
    }

    @Override
    public Internare getInternare() {
        return internare;
    }
}
