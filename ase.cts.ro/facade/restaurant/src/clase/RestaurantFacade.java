package clase;


public class RestaurantFacade {
    public void plaseazaComanda(String produs) {

            Masa masa = new Masa();
            Bucatarie bucatarie = new Bucatarie();
            CasaMarcat casa = new CasaMarcat();
            Ospatar ospatar = new Ospatar();

            masa.verificaDisponibilitate();
            bucatarie.preparaMancare(produs);
            casa.emiteBon();
            ospatar.anuntaServire();
        }
    }

