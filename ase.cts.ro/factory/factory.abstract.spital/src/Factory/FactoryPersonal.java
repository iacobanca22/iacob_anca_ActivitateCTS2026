package Factory;

import Personal.PersonalMedical;
import Personal.PersonalNonMedical;

public interface FactoryPersonal {

    PersonalMedical crearePersonalMedical(String nume);

    PersonalNonMedical crearePersonalNonMedical(String nume);
}
