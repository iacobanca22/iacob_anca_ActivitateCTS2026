package program;
import clase.*;
import clase.IImprimareStandard;

public class MainImprimare {
     public static void  main(String[] args){
         IImprimareStandard document= new DocumentSimplu();

         document= new ImprimareColor(document);

         document= new ImprimareDublex(document);
         document.print("rezumat");
    }
}
