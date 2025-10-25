import Pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Pokemon Entei = new Entei("Энтей", 50);
        Pokemon Makuhita = new Makuhita("Макухита", 20);
        Pokemon Hariyama = new Hariyama("Харияма", 40);
        Pokemon Slakoth = new Slakoth("Слакoт", 10);
        Pokemon Vigoroth = new Vigoroth("Вигорoт", 25);
        Pokemon Slaking = new Slaking("Слакин", 45);

        b.addAlly(Entei);
        b.addAlly(Makuhita);
        b.addAlly(Vigoroth);

        b.addFoe(Hariyama);
        b.addFoe(Slakoth);
        b.addFoe(Slaking);

        b.go();
    }
}
