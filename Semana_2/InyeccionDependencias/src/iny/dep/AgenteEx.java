package iny.dep;
/*Este es el agente externo que estara inyevtando en mi metodo Main a los juadores
es lo que normalmente viene en los Frameworks como Spring*/
public class AgenteEx {

    static Equipo arg=new Argentina("Apertura");
    static Equipo nz=new NuevaZelanda("Medio Scrum");
    static Equipo esc=new Escocia("Centro");
    static Equipo aus=new Australia("Ala");

    static void inyectar(Jugador jug, String pos){

        if (pos=="ape")
            jug.eq = arg;
        else if (pos=="ms")
            jug.eq = nz;
        else if (pos=="cen")
            jug.eq = esc;
        else
            jug.eq = aus;
    }

}//AgenteEx
