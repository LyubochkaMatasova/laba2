package com.company;
import ru.ifmo.se.pokemon.*;

public class DragonPulse extends PhysicalMove {
    public DragonPulse(){
        super(Type.DRAGON,85,100);
    }

    @Override
    protected String describe() {
        return "Dragon Pulse";
    }

}
