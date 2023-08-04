package patron.observer.obs;
import patron.oberver.sub.Sujeto;

public abstract class Observer {
    Sujeto sub;

    public Observer(Sujeto sub) {
        this.sub = sub;
        sub.attach(this);
    }

    public abstract void update();
}//Observer
