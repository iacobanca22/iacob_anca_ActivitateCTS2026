package prototip;
import prototip.Prototip;

public class Carte implements Prototip{
    private String title;
    private String autor;
    private String editura;
    private int nrPagini;

    public Carte(String title, String autor, String editura, int nrPagini) {
        if (title.length()>5 && title!=null){
            this.title = title;
        }else {
          //  this.title = "NAN";
        }
          if(autor.length()>4 && autor!=null ){
           this.autor = autor;
        }else {
            //  this.autor = "NAN";
          }
       if(editura.length()>1 && editura!=null ){
          this.editura = editura;
       }else {
           //this.editura = "NAN";
       }
        if(nrPagini>10){
            this.nrPagini = nrPagini;
        }else {
           // this.nrPagini = 0;
        }

    }
    private Carte(){

    }

    public void setNrPagini(int nrPagini) {
        this.nrPagini = nrPagini;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "title='" + title + '\'' +
                ", autor='" + autor + '\'' +
                ", editura='" + editura + '\'' +
                ", nrPagini=" + nrPagini +
                '}';
    }

    @Override
    public Prototip copiaza() {
        Carte carte= new Carte();
        carte.title=this.title;
        carte.autor=this.autor;
        carte.editura=this.editura;
        carte.nrPagini=this.nrPagini;
        return carte;
    }
}
