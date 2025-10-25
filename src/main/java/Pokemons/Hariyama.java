package Pokemons;

import Attacks.StoneEdge;

public final class Hariyama extends Makuhita {
    public Hariyama(String name, int level) {
        super(name, level);
        setStats(144, 120, 60, 40, 60, 50);
        addMove(new StoneEdge());
    }
}
