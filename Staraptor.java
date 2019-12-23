package com.company;
import ru.ifmo.se.pokemon.*;

public class Staraptor extends Stravia {
    public Staraptor() {
        this("Staraptor",1);


    }
    public Staraptor(String name,int level){
        super(name,level);
        this.setType(Type.NORMAL,Type.FLYING);
        this.setStats(85,120,70,50,60,100);
        this.addMove(new Rest());
    }


}
