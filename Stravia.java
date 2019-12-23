package com.company;

import ru.ifmo.se.pokemon.*;

public class Stravia extends Starly {
    public Stravia() {
        this("Stravia",1);


    }
    public Stravia(String name,int level){
        super(name,level);
        this.setType(Type.NORMAL,Type.FLYING);
        this.setStats(55,75,50,40,40,80);
        this.addMove(new Flatter ());
    }
}


