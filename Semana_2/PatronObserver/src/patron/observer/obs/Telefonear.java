package patron.observer.obs;

import patron.oberver.sub.Sujeto;

import javax.security.auth.Subject;

public class Telefonear extends Observer {
    String telefonear;

    public Telefonear(String telefonear, Sujeto sub) {
        super(sub);
        this.telefonear = telefonear;
    }//telefonear

    void marcarNumero(){
        System.out.println("Marcando número: "+ telefonear);
    }

    @Override
    public void update() {
        marcarNumero();
    }
}//Telefonear
