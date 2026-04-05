package clase;

public class Sectie implements DepartamenteSpital {
    private String nume;

    public Sectie(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaNod(DepartamenteSpital dep) throws Exception {
        throw new Exception("Not implemented");
    }

    @Override
    public void stergereNod(DepartamenteSpital dep) throws Exception {
        throw new Exception("Not implemented");
    }

    @Override
    public DepartamenteSpital getDepartamentspital(int index) throws Exception {
        throw new Exception("Not implemented");
    }

    @Override
    public void afiseaza() throws Exception {
        System.out.println("Sectie"+nume);


    }
}

