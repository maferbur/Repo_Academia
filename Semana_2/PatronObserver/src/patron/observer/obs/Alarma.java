package patron.observer.obs;

import patron.oberver.sub.Sujeto;

public class Alarma extends Observer{
    String alarma;

    public Alarma(String alarma, Sujeto sub) {
        super(sub);
        this.alarma = alarma;
    }//Constructor

    void programarAlarma(){
        System.out.println("Programar Alarma: " + alarma);
    }

    @Override
    public void update() {
        programarAlarma();
    }
}//Alarma
