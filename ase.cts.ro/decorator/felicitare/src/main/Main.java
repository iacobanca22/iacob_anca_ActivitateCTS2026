package main;
import decorator.pattern.NotaPlata;
import decorator.pattern.NotaCuFelicitare;
import clase.Nota;

public class Main {
    public static void main(String[] args) {

        Nota nota = new NotaPlata();
        nota = new NotaCuFelicitare(nota);

        nota.printeaza();
    }
}
