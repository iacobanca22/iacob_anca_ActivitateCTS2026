package Clase;

public class InscriereElevFacade {
    public boolean verificaInscriere() {

        LocuriLibere locuri = new LocuriLibere(true);
        PlataTaxa plata = new PlataTaxa(true);
        SituatieScoalara situatie = new SituatieScoalara(9);

        if (locuri.areLocuri() &&
                plata.taxaPlatita() &&
                situatie.estePromovat()) {

            System.out.println("Elevul poate fi inscris");
            return true;
        }

        System.out.println("Elevul NU poate fi inscris");
        return false;
    }
}
