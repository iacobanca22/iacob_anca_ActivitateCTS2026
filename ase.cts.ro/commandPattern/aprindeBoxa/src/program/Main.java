package program;
import clase.*;

public class Main {
    public static void main(String[] args){
        BoxaConcreta boxa= new BoxaConcreta("Samsung");
        Telecomanda telecomanda=new Telecomanda();

        Command aprinde= new ComandaAprindere(boxa);
        Command stingere= new ComandaStingere(boxa);

        telecomanda.invoca(aprinde);
        telecomanda.invoca(stingere);

    }
}
