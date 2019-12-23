package com.company;
import ru.ifmo.se.pokemon.*;


public  class FocusBlast  extends SpecialMove {

    public FocusBlast () {
        super( Type.FIGHTING,70,120);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE,-1));
    }

    @Override
    protected String describe() { return " FocusBlast"; }
}
