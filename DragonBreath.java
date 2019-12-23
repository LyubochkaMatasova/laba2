package com.company;
import ru.ifmo.se.pokemon.*;

public class DragonBreath extends PhysicalMove {
        public  DragonBreath(){
            super(Type.DRAGON,60,100);
        }

    @Override
    protected void applyOppEffects(Pokemon P){
                P.addEffect(new Effect().chance(0.3).condition(Status.PARALYZE));
            }

    @Override
        protected String describe() {
            return "Dragon Breath";
        }
}
