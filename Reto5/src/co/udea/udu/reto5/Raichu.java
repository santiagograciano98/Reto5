package co.udea.udu.reto5;

public class Raichu extends Pokemon{

    public Raichu() {
    }

    public Raichu(String nombre, byte nivel, int puntajeSalud) {
        super(nombre, nivel, puntajeSalud);
    }
    

    @Override
    public Pokemon evolucionar() {
        return null;
    }

    @Override
    public String gritar() {
        return "Raichu";
    }
    
}
