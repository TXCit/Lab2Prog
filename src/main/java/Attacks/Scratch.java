package Attacks;

import ru.ifmo.se.pokemon.*;

public final class Scratch extends PhysicalMove {
    public Scratch() {
        super(Type.NORMAL, 40, 100);
    }

    @Override
    protected String describe() {
        return "использует Scratch";
    }
}

