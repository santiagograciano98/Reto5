package co.udea.udu.reto5;

public class Reto5 {

    public static void main(String[] args) {
        Pokebola miPokebola = new Pokebola();

        Pokemon charmander = new Charmander("Darkai", (byte) 1, 100);
        System.out.println(charmander.gritar());
        miPokebola.setMiPokemon(charmander);

        Pokebola miPokebola1 = new Pokebola();
        Pokemon charmeleon = charmander.evolucionar();
        System.out.println(charmeleon.gritar());
        miPokebola1.setMiPokemon(charmeleon);

        Pokebola miPokebola2 = new Pokebola();
        Pokemon charizard = charmeleon.evolucionar();
        System.out.println(charizard.gritar());
        miPokebola2.setMiPokemon(charizard);

        Pokebola miPokebola3 = new Pokebola();
        Pokemon pikachu = new Pikachu("Dialga", (byte) 22, 100);
        System.out.println(pikachu.gritar());
        miPokebola3.setMiPokemon(pikachu);

        Pokebola miPokebola4 = new Pokebola();
        Pokemon raichu = pikachu.evolucionar();
        System.out.println(raichu.gritar());
        miPokebola4.setMiPokemon(raichu);

        Pokebola miPokebola5 = new Pokebola();
        Pokemon squirtle = new Squirtle("Jirachi", (byte) 36, 100);
        System.out.println(squirtle.gritar());
        miPokebola5.setMiPokemon(squirtle);

        Pokebola miPokebola6 = new Pokebola();
        Pokemon wartortle = squirtle.evolucionar();
        System.out.println(wartortle.gritar());
        miPokebola6.setMiPokemon(wartortle);

        Pokebola miPokebola7 = new Pokebola();
        Pokemon blastoise = wartortle.evolucionar();
        System.out.println(blastoise.gritar());
        miPokebola7.setMiPokemon(blastoise);

    }

}
