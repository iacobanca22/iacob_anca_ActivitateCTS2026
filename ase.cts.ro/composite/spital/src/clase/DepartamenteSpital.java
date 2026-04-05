package clase;

public interface DepartamenteSpital {
    void adaugaNod(DepartamenteSpital dep) throws Exception;
    void stergereNod(DepartamenteSpital dep) throws Exception;
    DepartamenteSpital getDepartamentspital(int index) throws Exception;

    void afiseaza() throws Exception;
}
