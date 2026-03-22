package clase;

public class AdapterRestaurant implements TargetFactura {
    private SistemNouRestaurant sistemNou;

    public AdapterRestaurant(SistemNouRestaurant sistemNou) {
        this.sistemNou = sistemNou;
    }


    @Override
    public void printeazaFactura() {
        sistemNou.afiseazaBon();
    }
}
