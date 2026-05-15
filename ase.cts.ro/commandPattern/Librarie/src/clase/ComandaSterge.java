package clase;

public class ComandaSterge implements Command{
    private Carte carte;
    private Stoc stoc;

    public ComandaSterge(Stoc stoc,Carte carte)  {
        this.carte = carte;
        this.stoc = stoc;
    }

    @Override
    public void unexecute() {
        stoc.anulareSterge(carte);
    }

    @Override
    public void executa() {
        stoc.stergeCarte(carte);
    }
}
