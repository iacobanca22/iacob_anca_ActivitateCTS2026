package clase;

public class BoxaConcreta implements Boxa{
    private String name;

    public BoxaConcreta(String name) {
        this.name = name;
    }

    @Override
    public void aprinde() {
        System.out.println("Aprinde boxa:"  + name);
    }

    @Override
    public void stinge() {
        System.out.println("Stinge boxa:" +name);
    }
}
