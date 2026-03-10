package Factory;
import Personal.PersonalSpital;
import Personal.PersonalNonMedical;
import Personal.PersonalMedical;
import Personal.Medic;
import Personal.Secretar;

public class FactorySpital implements FactoryPersonal {

    public PersonalMedical crearePersonalMedical(String nume) {
        return new Medic(nume);
    }

    public PersonalNonMedical crearePersonalNonMedical(String nume) {
        return new Secretar(nume);
    }
}
