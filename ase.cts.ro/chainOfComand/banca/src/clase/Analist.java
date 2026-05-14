package clase;

public abstract class Analist {
    private Analist urmatorulAnalist;

    public Analist getUrmatorulAnalist() {
        return urmatorulAnalist;
    }

    public void setUrmatorulAnalist(Analist urmatorulAnalist) {
        this.urmatorulAnalist = urmatorulAnalist;
    }
   public abstract void proceseaza(Client client);
}
