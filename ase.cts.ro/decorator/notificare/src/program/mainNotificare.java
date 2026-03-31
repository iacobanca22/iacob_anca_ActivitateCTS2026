package program;

import clase.*;

public class mainNotificare {
    public static void main(String[] args){
        INotificare notificare= new NotificareSimpla();
        notificare.trimite(" Notificare simpla");

        notificare=new MesajSMS(notificare);
        notificare.trimite(" Notificare SMS");

        notificare=new MesajEmail(notificare);
        notificare.trimite(" Notificare Email");

        notificare=new MesajWhatsUp(notificare);
        notificare.trimite(" Notificare WhatsUp");
    }
}
