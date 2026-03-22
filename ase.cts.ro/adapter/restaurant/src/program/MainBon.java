package program;
import clase.*;

import clase.AdapterRestaurant;
import clase.SistemNouRestaurant;
import clase.SistemVechi;
import clase.TargetFactura;

public class MainBon {
    public static void main(String[] args){
        TargetFactura factura = new SistemVechi();
        factura.printeazaFactura();

        SistemNouRestaurant restaurant= new SistemNouRestaurant();
        TargetFactura FacturaNoua= new AdapterRestaurant(restaurant);
        FacturaNoua.printeazaFactura();

    }
}


