package builder.program;
import builder.BuilderMasa;
import builder.Ospatar;
import obiect.Masa;
import builder.BuilderMasaRestaurant;


public class Program {

    public static void main(String[] args) {

        BuilderMasa builder = new BuilderMasaRestaurant();

        Ospatar ospatar = new Ospatar(builder);

        ospatar.pregatesteMasa();

        Masa masa = builder.getMasa();

        System.out.println(masa);
    }
}