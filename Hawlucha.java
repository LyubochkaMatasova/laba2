package com.company;

import ru.ifmo.se.pokemon.*;


public class Hawlucha extends Pokemon {

    public Hawlucha() {
        this("Hawlucha",1);

    }
    public Hawlucha(String name,int level){
        super(name,level);
        this.setType(Type.FIRE,Type.FLYING);
        this.setStats(78,92,75,74,63,118);
        this.addMove(new DragonBreath());
        this.addMove(new Tickle());
        this.addMove(new ConfuseRay() );
        this.addMove(new DragonPulse());
    }


}


