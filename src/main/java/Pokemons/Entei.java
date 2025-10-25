package Pokemons;
import Attacks.Bulldoze;
import Attacks.FireBlast;
import Attacks.Leer;
import Attacks.WillOWisp;
import ru.ifmo.se.pokemon.*;
public final class Entei extends Pokemon {
    public Entei(String name, int level) {
        super(name, level);
        setType(Type.FIRE);
        setStats(115, 115, 85, 90, 75, 100);
        addMove(new WillOWisp());
        addMove(new FireBlast());
        addMove(new Leer());
        addMove(new Bulldoze());
    }
}
