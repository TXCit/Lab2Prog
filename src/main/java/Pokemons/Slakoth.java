package Pokemons;

import Attacks.RockSlide;
import Attacks.Scratch;
import ru.ifmo.se.pokemon.*;

public class Slakoth extends Pokemon {
    public Slakoth(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(60, 60, 60, 35, 35, 30);
        addMove(new RockSlide());
        addMove(new Scratch());
    }
}

