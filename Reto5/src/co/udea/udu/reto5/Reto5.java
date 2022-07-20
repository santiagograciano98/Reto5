package co.udea.udu.reto5;

public class Reto5 {

    public static void main(String[] args) {
        // TODO code application logic here
        Pokemon charmeleon = new Charmeleon("hhh", (byte)1, 100);
        charmeleon = charmeleon.evolucionar();
        
        
        System.out.println(charmeleon.gritar());
    }
    
}
