package program;
import clase.Editura;
import patternObserver.ObservatorConcret;

public class mainEditura {
    public static void main(String[] args) {


        Editura editura = new Editura("DIY Expert");


        ObservatorConcret o1 =
                new ObservatorConcret("Ana");

        ObservatorConcret o2 =
                new ObservatorConcret("Ion");


        editura.adaugaObserver(o1);
        editura.adaugaObserver(o2);


        editura.trimiteNotificare(
                "A aparut noua revista de bricolaj!"
        );
        editura.notificareRevistaNoua();

        editura.notificareReducere();
    }
}

