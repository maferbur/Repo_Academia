//objetivo del observer, debemos tener un bajo acplamiento, y una añta cohesion
//eso nos indica que ese componente se dedicara a realizar esa tarea
package patron;

import patron.oberver.sub.Celular;
import patron.observer.obs.Alarma;
import patron.observer.obs.Facebook;
import patron.observer.obs.Scrolear;
import patron.observer.obs.Telefonear;

public class Main {
    public static void main(String[] args) {
       Celular celular = new Celular();
       Alarma alarma = new Alarma("Sonar a las 6 AM",celular);
       Facebook facebook = new Facebook("Publicando en tu muro...",celular);
       Telefonear telefonear = new Telefonear("Marcando a Casa",celular);

       /*celular.attach(alarma);
       celular.attach(facebook);
       celular.attach(telefonear);*/

       celular.desbloquear();
       System.out.println("------Bloquear Celular. Loading...");
       celular.detach(facebook);
       celular.desbloquear();
       System.out.println("------Bloquear Celular. Loading...");
       celular.detach(telefonear);
       new Scrolear(celular);
       new Alarma("Sonar 8:30 AM",celular);
       celular.desbloquear();


    }//main
}//Main