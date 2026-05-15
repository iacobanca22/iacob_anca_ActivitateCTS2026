package clase;

public class PiesaMuzicala implements InterfataMuzicala{
    private String titlu;
    private float durata;

    public PiesaMuzicala(String titlu, float durata) {
        this.titlu = titlu;
        this.durata = durata;
    }

    @Override
    public void reda() {
        System.out.println("PiesaMuzicala reda"+titlu);
    }

    @Override
    public void descrie() {
        System.out.println("Melodia este pop");

    }

}
