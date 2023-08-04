package patron.observer.obs;

import patron.oberver.sub.Sujeto;

public class Scrolear extends Observer {

    public Scrolear(Sujeto sub) {
        super(sub);
    }

    void dezlizarPantalla(){
        System.out.println("Procrastinando...");
    }

    @Override
    public void update() {
        dezlizarPantalla();
    }

}
