package program;
import clase.*;

import clase.MedicamentFarmacie;
import clase.MedicamentFarmacieImpl;
import clase.MedicamentSpital;

public class MainReteta {
    public static void proceseazaMedicament(MedicamentFarmacie medicament){
    medicament.cumparaMedicament();
    }
    public static void main(String[] args){
        MedicamentFarmacie medicament= new MedicamentFarmacieImpl();
        proceseazaMedicament(medicament);

        System.out.println("Se doreste folosirea medicamentelor din spital");

        MedicamentSpital medicamentSpital = new MedicamentSpital("Paracetamol");
        medicamentSpital.achizitioneazaMedicament();

        System.out.println("\nSe foloseste Adapter:");

        MedicamentFarmacie medicamentAdapter = new MedicamentAdapter("Nurofen");
        proceseazaMedicament(medicamentAdapter);





    }
}
