package clase;

public class TipSpalare {
    private String tipSpalare;

    public TipSpalare(String tipSpalare) {
        this.tipSpalare = tipSpalare;
    }

    public String getTipSpalare() {
        return tipSpalare;
    }

    @Override
    public String toString() {
        return "TipSpalare{" +
                "tipSpalare='" + tipSpalare + '\'' +
                '}';
    }
}
