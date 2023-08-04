package patron.oberver.sub;
import patron.observer.obs.Alarma;
import patron.observer.obs.Facebook;
import patron.observer.obs.Telefonear;

public class Celular extends Sujeto{
   // Alarma alar;     Se quitan estos atributos
   // Facebook face;   para evitar el alto acoplamieno
   // Telefonear phone;

    public void desbloquear(){
        System.out.println("Desbloquear celular");
        notificar();
    }//desbloquear
}//celular
