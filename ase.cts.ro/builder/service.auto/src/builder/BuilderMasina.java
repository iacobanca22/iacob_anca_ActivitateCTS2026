package builder;
import clasa.Masina;
import builder.BuilderService;

public class BuilderMasina implements BuilderService {

    private Masina masina;
    public BuilderMasina() {
        masina =new Masina();
    }

    @Override
    public void numeClient() {
        masina.setNumeClient("Gigel");
    }

    @Override
    public void schimbUlei() {
        masina.setSchimbUlei(true);

    }

    @Override
    public void tipMasina() {
      masina.setTipMasina("Nan");
    }

    @Override
    public void spalaMasina() {
    masina.setSpalareMasina(true);
    }

    @Override
    public Masina getMasina() {
        return masina;
    }
}
