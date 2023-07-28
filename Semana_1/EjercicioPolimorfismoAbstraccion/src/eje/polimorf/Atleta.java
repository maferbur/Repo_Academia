package eje.polimorf;

public abstract class Atleta {
    int pesokg;
    int estatura;

    public Atleta(int pesokg, int estatura) {
        this.pesokg = pesokg;
        this.estatura = estatura;

    }//constructor, el constructor en las clases abstractas nos ayudan a definir un comportamiento
    //en las clases hijas

    abstract  int caracCorporal (); //metodo abtracto donde no se define el comportamiento
    //es decir que las clases hijas son las que deben definir el comportamiento de la clase Atleta

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + //no entiendo
                " pesokg=" + pesokg +
                ", estatura=" + estatura +
                '}';
    }
}//Class Atleta
