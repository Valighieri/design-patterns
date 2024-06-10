package com.valentyn.behavioral.adapter;

import com.valentyn.behavioral.adapter.adapters.SquarePegAdapter;
import com.valentyn.behavioral.adapter.round.RoundHole;
import com.valentyn.behavioral.adapter.round.RoundPeg;
import com.valentyn.behavioral.adapter.square.SquarePeg;

class Demo {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(4);

        RoundPeg roundPeg = new RoundPeg(4);
        System.out.println(roundPeg.getRadius());
        System.out.println(roundHole.fits(roundPeg));

        SquarePeg squarePeg = new SquarePeg(2);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);
        System.out.println(squarePegAdapter.getRadius());
        System.out.println(roundHole.fits(squarePegAdapter));
    }
}
