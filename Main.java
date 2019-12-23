package com.company;

import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main (String[] args) {
	Battle b = new Battle();
        b.addAlly(new Hawlucha ());
        b.addAlly(new Numel());
        b.addAlly(new Camerupt());
        b.addFoe(new Starly());
        b.addFoe(new Stravia());
        b.addFoe(new Staraptor());

        b.go();
    }
}
