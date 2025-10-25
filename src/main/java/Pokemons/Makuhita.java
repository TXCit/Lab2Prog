package Pokemons;

import Attacks.Confide;
import Attacks.Rest;
import Attacks.SeismicToss;
import ru.ifmo.se.pokemon.*;

public class Makuhita extends Pokemon {
    public Makuhita(String name, int level) {
        super(name, level);
        setType(Type.FIGHTING);
        setStats(72, 60, 30, 20, 30, 25);
        addMove(new Confide());
        addMove(new Rest());
        addMove(new SeismicToss());
    }
}
