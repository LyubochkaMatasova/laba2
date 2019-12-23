package com.company;
import ru.ifmo.se.pokemon.*;

public class Camerupt extends Numel{
    public Camerupt() {
        this("Camerput",1);


    }
    public Camerupt(String name,int level){
        super(name,level);
        this.setType(Type.FIRE,Type.GROUND);
        this.setStats(70,100,70,105,75,40);
        this.addMove(new DefenceCurl());
    }
}

