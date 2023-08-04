package patron.observer.obs;

import patron.oberver.sub.Sujeto;

public class Facebook extends Observer{
    String facebook;

    public Facebook(String facebook, Sujeto sub) {
        super(sub);
        this.facebook = facebook;
    }//consructor

    void compartirPublicacion(){
        System.out.println("Compartiendo publición: "+facebook);
    }

    @Override
    public void update() {
        compartirPublicacion();
    }
}//Facebook
