package clase;

public class ContBancar {
    private String iban;
    private double sold;

    public ContBancar(double balance, String iban) {
        this.sold = balance;
        this.iban = iban;
    }


    public void depune(double suma) {
        this.sold+=suma;
        System.out.println("Depunere:"+iban+":"+suma);
    }


    public void retrage(double suma) {
        this.sold-=suma;
        System.out.println("Retragere:"+iban+":"+suma);
    }

    public double getSold() {
        return sold;
    }
}
