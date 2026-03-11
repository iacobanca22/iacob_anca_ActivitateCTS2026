package builder.program;

import builder.BuilderInternarePacient;
import builder.BuilderInternare;
import builder.obiect.Internare;

public class Main {
    public static void main(String[] args) {

        BuilderInternare builder = new BuilderInternarePacient();

        builder.starePacient();
        builder.salonDisponibil();
        builder.fisaInternare();

        Internare internare = builder.getInternare();

        System.out.println(internare);
    }
}