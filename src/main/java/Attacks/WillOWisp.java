package Attacks;

import ru.ifmo.se.pokemon.*;

public final class WillOWisp extends StatusMove {
    public WillOWisp() {
        super(Type.FIRE, 0, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.burn(p);
    }

    @Override
    protected String describe() {
        return "использует Will-O-Wisp";
    }
}

