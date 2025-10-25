package Attacks;

import ru.ifmo.se.pokemon.*;

public final class FocusEnergy extends StatusMove {
    public FocusEnergy() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected String describe() {
        return "использует FocusEnergy";
    }
}


