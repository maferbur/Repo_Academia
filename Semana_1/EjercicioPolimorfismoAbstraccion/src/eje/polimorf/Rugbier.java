package eje.polimorf;

public class Rugbier extends Atleta{
    public Rugbier(int pesokg, int estatura) {
        super(pesokg, estatura);
    }//constructor

    @Override
    int caracCorporal (){
        return pesokg/(estatura*estatura)+10;
    }//caracCorporal

}//Class Rugbier
