package clase;

public class Client {
    private String name;
    private Integer venit;
    private Integer scorCredit;

    public Client(String name, Integer venit, Integer scorCredit) {
        this.name = name;
        this.venit = venit;
        this.scorCredit = scorCredit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVenit() {
        return venit;
    }

    public void setVenit(int venit) {
        this.venit = venit;
    }

    public Integer getScorCredit() {
        return scorCredit;
    }

    public void setScorCredit(int scorCredit) {
        this.scorCredit = scorCredit;
    }
}
