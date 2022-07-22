package co.udea.udu.reto5;

public class Blastoise extends Pokemon{

    public Blastoise() {
    }

    public Blastoise(String nombre, byte nivel, int puntajeSalud) {
        super(nombre, nivel, puntajeSalud);
    }
    

    @Override
    public Pokemon evolucionar() {
        return null;
    }

    @Override
    public String gritar() {
        return "Blastoise";
    }
    
}
