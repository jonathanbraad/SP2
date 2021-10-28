package com.company;

import java.util.ArrayList;

public class Garage {

    ArrayList<Bil> biler = new ArrayList<Bil>();

    public void tilføjBil(Bil bil) {
        this.biler.add(bil);
    }

    @Override
    public String toString() {
        return "Garage{" +
                "biler=" + biler +
                '}';
    }

    public double beregnGrønAfgiftForBilpark() {
        double sumAfgift = 0;
        for (Bil bil : this.biler) {
            sumAfgift = sumAfgift + bil.beregnGrønEjerafgift();
        }
        return sumAfgift;
    }
}
