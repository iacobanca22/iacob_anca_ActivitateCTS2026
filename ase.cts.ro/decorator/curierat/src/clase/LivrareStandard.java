package clase;

public class LivrareStandard implements ILivrare{
    @Override
    public String descriere() {
        return "Livrare Standard";
    }

    @Override
    public double cost() {
        return 22;
    }
}
