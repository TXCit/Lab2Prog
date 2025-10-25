package Pokemons;

import Attacks.Rest;

public final class Slaking extends Vigoroth {
    public Slaking(String name, int level) {
        super(name, level);
        setStats(150, 160, 100, 95, 65, 100);
        addMove(new Rest());
    }
}

