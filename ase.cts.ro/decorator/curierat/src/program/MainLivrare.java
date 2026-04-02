package program;
import clase.*;
import clase.ILivrare;
import clase.Livrare;

public class MainLivrare {
   public  static void main(String args[]){
        ILivrare livrare = new LivrareStandard();
       System.out.println(livrare.descriere());
       System.out.println(livrare.cost());

       livrare=new LivrareWeekend(livrare);
       System.out.println(livrare.descriere());
       System.out.println(livrare.cost());

       livrare=new LivrareRapida(livrare);
       System.out.println(livrare.descriere());
       System.out.println(livrare.cost());

       livrare=new LivrareAsigurare(livrare);
       System.out.println(livrare.descriere());
       System.out.println(livrare.cost());

       ((DecoratorAbstractLivrare) livrare).tracking();



    }
}
