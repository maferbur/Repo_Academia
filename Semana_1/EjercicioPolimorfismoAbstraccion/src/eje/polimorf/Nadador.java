package eje.polimorf;
public class Nadador extends Atleta{
    public Nadador(int pesokg, int estatura) {
        super(pesokg, estatura);
    }//constructor

    @Override
    int caracCorporal (){
        return estatura/pesokg*2;
    }//caracCorporal


}//Class nadador
