package com.company;
import ru.ifmo.se.pokemon.*;


public class Starly extends Pokemon {
    public Starly() {
        this("Starly",1);


    }
    public Starly(String name,int level){
        super(name,level);
        this.setType(Type.NORMAL,Type.FLYING);
        this.setStats(40,55,30,30,30,60);
        this.addMove(new Facade());
        this.addMove(new ShadowBall());

    }
}

