package program;
import clase.*;
import clase.DepartamenteSpital;

public class MainSpital {
    public static void main(String[] args) throws Exception{
        DepartamenteSpital dep0=new DepartamentPachet("Spital");
        DepartamenteSpital dep1=new DepartamentPachet("Departament Medical");
        DepartamenteSpital dep2= new DepartamentPachet("DepartamentChirurgie");
        DepartamenteSpital dep3= new DepartamentPachet("Administrativ");

        DepartamenteSpital subdep1= new DepartamentPachet("Cardiologie");
        DepartamenteSpital subdep2= new DepartamentPachet("Neuorlogie");
        DepartamenteSpital subdep3= new DepartamentPachet("HR");
        DepartamenteSpital subdep4= new DepartamentPachet("Contabilitate");

        Sectie ati=new Sectie("ATI");
        Sectie ambiulator=new Sectie("Ambulator");
        Sectie cGenerala=new Sectie("Chrurgie generala");
        Sectie cOrtopedie=new Sectie("Chirurgie ortopedica");

        try {
            dep2.adaugaNod(cGenerala);
            dep2.adaugaNod(cOrtopedie);

            subdep1.adaugaNod(ati);
            subdep1.adaugaNod(ambiulator);
            dep1.adaugaNod(subdep1);
            dep1.adaugaNod(subdep2);


            dep3.adaugaNod(subdep3);
            dep3.adaugaNod(subdep4);

            dep0.adaugaNod(dep1);
            dep0.adaugaNod(dep2);
            dep0.adaugaNod(dep3);

            dep0.afiseaza();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
