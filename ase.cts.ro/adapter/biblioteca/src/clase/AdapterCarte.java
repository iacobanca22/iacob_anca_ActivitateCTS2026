package clase;

public class AdapterCarte extends CarteBiblioteca implements CarteOnline {

    public AdapterCarte(String titlu) {
        super(titlu);
    }


    @Override
    public void descarcaCarte() {
        super.imprumutCarte();
    }

}
