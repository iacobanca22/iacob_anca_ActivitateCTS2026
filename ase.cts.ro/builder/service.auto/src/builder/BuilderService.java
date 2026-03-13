package builder;
import clasa.Masina;

public interface BuilderService {
    void numeClient();
    void tipMasina();
    void schimbUlei();
    void spalaMasina();

    Masina getMasina();
}
