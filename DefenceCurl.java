package com.company;
import ru.ifmo.se.pokemon.*;

public class DefenceCurl extends SpecialMove {


    public DefenceCurl() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().stat(Stat.DEFENSE, 1));
    }
   @Override
   protected String describe() {
       return "Defence Curl";
   }
}
