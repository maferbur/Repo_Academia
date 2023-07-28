package eje.polimorf;

public class Beisbolista extends Atleta{
    public Beisbolista(int pesokg, int estatura) {
        super(pesokg, estatura);
    }//constructor

    @Override
    int caracCorporal() {
        return pesokg+estatura;
    }//caracCorporal

}//class Beisbolista
