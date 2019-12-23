package com.company;

import ru.ifmo.se.pokemon.*;

public class Numel extends Pokemon {
    public Numel() {
        this("Numel",1);



    }
    public Numel(String name,int level){
        super(name,level);
        this.setType(Type.FIRE,Type.GROUND);
        this.setStats(60,60,40,65,45,35);
        this.addMove(new Facade());
        this.addMove(new Scratch());
        this.addMove(new FocusBlast());
    }

}


