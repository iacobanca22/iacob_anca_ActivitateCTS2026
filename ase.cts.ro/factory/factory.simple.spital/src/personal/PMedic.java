package personal;

public class PMedic extends PersonalMedical {

    public PMedic(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        return "PMedic:"+nume;
    }
}