package introduction;

public class PokemonTest {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon();
        pikachu.name = "Pikachu";
        pikachu.type = "Electric";
        pikachu.health = 70;
        pikachu.attack();

        Pokemon profesori = new Pokemon();
        profesori.name = "Naim";
        profesori.type = "Provim";
        profesori.health = 100;
        profesori.attack();

        Pokemon bubreci = new Pokemon();
        bubreci.name = "Buba";
        bubreci.type = "pickim";
        bubreci.health = 1;
        bubreci.attack();

    }
}











