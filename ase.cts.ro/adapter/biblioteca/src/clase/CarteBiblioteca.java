package clase;

public class CarteBiblioteca {
    private String nameCarte;

    public CarteBiblioteca(String nameCarte) {
        this.nameCarte = nameCarte;
    }
    public void imprumutCarte(){
        System.out.println("Se doreste spre imprumut cartea "+nameCarte);
    };
    public void verificareAbonament(){
        System.out.println(" Se verifica abonamenti");

    }

    @Override
    public String toString() {
        return "CarteBiblioteca{" +
                "nameCarte='" + nameCarte + '\'' +
                '}';
    }
}
