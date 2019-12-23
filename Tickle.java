package com.company;

import ru.ifmo.se.pokemon.*;

public class Tickle extends SpecialMove {
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().stat(Stat.DEFENSE, 1));
        p.addEffect(new Effect().stat(Stat.ATTACK, 1));
    }
    @Override
    protected String describe() {
        return "Tickle";
    }
}
