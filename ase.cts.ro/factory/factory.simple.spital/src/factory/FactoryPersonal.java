package factory;

import personal.*;

public class FactoryPersonal {

    public static PersonalSpitalS crearePersonal(TipPersonal tip, String nume) {

        switch (tip) {

            case PMEDIC:
                return new PMedic(nume);

            case PASISTENT:
                return new PAsistent(nume);

            case PBRANCARDIER:
                return new PBrancardier(nume);

            default:
                return null;
        }
    }
}