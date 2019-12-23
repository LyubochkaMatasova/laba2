package com.company;
import ru.ifmo.se.pokemon.*;


public class Flatter extends SpecialMove {
        public Flatter(){
            super(Type.DARK,0,100);
        }
    @Override
        protected void applyOppEffects(Pokemon p){
        p.addEffect(new Effect().stat(Stat.ATTACK,-1));
            p.confuse();
        }
       @Override
       protected String describe() {
           return "Flatter";
       }
    }

