package eje.polimorf;

public class Futbolista extends Atleta{
    public Futbolista(int pesokg, int estatura) {
        super(pesokg, estatura);
    }//constructor

    @Override
    int caracCorporal (){
        return pesokg*estatura;
    }//caracCorporal

}//Class Futbolista
