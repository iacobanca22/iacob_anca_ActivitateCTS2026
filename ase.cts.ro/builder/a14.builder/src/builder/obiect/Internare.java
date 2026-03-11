package builder.obiect;

public class Internare {

    private boolean starePacient;
    private boolean salonDisponibil;
    private boolean fisaInternare;

    public void setStarePacient(boolean starePacient) {
        this.starePacient = starePacient;
    }

    public void setSalonDisponibil(boolean salonDisponibil) {
        this.salonDisponibil= salonDisponibil;
    }

    public void setFisaInternare(boolean fisaInternare) {
       this.fisaInternare = fisaInternare;
    }

    @Override
    public String toString() {
        return "Internare{" +
                "StarePacient=" + starePacient +
                ", SalonDisponibil=" + salonDisponibil +
                ", FisaInternare=" + fisaInternare +
                '}';
    }
}
