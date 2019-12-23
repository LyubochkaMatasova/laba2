package com.company;
import ru.ifmo.se.pokemon.*;
public class ConfuseRay extends SpecialMove {

    public ConfuseRay(){
        super(Type.GHOST,0,100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.confuse();
    }
    @Override
    protected String describe() {
        return "Confuse Ray";
    }
}
