package clase;

public class CofetarieFacade {

    public void comandaTort(String tort) {

        StocIngrediente stoc = new StocIngrediente();
        Bucatar bucatar = new Bucatar();
        Livrare livrare = new Livrare();

        if (stoc.verificaIngrediente(tort)) {
            bucatar.preparaTort(tort);
            livrare.livreaza(tort);
        } else {
            System.out.println("Nu sunt ingrediente suficiente");
        }
    }
}