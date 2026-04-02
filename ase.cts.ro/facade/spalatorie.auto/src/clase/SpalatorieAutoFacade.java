package clase;

public class SpalatorieAutoFacade {
  public void spalaMasina(String tipMasina,String nr, String tipSpalare, String tipCeara, String client){
      Masina masina= new Masina(tipMasina,nr);
      TipSpalare spalare=new TipSpalare(tipSpalare);
      Ceara ceara=new Ceara(tipCeara);
      Client numeClient= new Client(client);

      VerificaMasina verificare= new VerificaMasina();
      SpalareExterioara spalareExt=new SpalareExterioara(tipSpalare);
      CuratareInterioara curatareInt=new CuratareInterioara(tipSpalare);
      AplicareCeara aplicareCeara=new AplicareCeara(tipCeara);;
      EmitereBonSpalare bon=new EmitereBonSpalare(client);


      verificare.verificaMasina(masina);
      curatareInt.curataInt();
      aplicareCeara.aplicaCeara();
      bon.emitereBon();





  }

}
