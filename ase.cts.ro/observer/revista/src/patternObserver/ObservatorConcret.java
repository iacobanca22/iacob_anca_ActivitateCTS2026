package patternObserver;

public class ObservatorConcret implements Observer {

    private String numeAbonat;

    public ObservatorConcret(String numeAbonat) {

        this.numeAbonat = numeAbonat;
    }

    @Override
    public void receptionareMesaj(String mesaj) {

        System.out.println(
                numeAbonat + " a primit mesajul: " + mesaj
        );
    }
}