package co.udea.udu.reto5;


public class Charizard extends Pokemon{

    public Charizard() {
    }

    public Charizard(String nombre, byte nivel, int puntajeSalud) {
        super(nombre, nivel, puntajeSalud);
    }
    

    @Override
    public Pokemon evolucionar() {
        return null;
    }

    @Override
    public String gritar() {
        return "Charizard";
    }
    
}
