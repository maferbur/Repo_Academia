package patron.oberver.sub;
import patron.observer.obs.Observer;
import java.util.ArrayList;
import java.util.List;

public abstract class Sujeto {

    List<Observer> listaObservadores;

    public Sujeto() {
        listaObservadores = new ArrayList<>();
    }//constructor

    public void attach(Observer o){
        listaObservadores.add(o);
    }//attach

    public void detach(Observer o){
        listaObservadores.remove(o);
    }//detach

    public void notificar(){
        for(Observer o: listaObservadores)
            o.update();
    }//notificar

}//Sujeto
