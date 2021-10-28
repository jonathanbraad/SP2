package com.company;

abstract class Bil {
String regNR;
String Mærke;
String Model;
int Årgang;
int antalDøre;

    public Bil(String regNR, String mærke, String model, int årgang, int antalDøre) {
        this.regNR = regNR;
        Mærke = mærke;
        Model = model;
        Årgang = årgang;
        this.antalDøre = antalDøre;
    }

public abstract double beregnGrønEjerafgift();

    public String getRegNR() {
        return regNR;
    }

    public void setRegNR(String regNR) {
        this.regNR = regNR;
    }

    public String getMærke() {
        return Mærke;
    }

    public void setMærke(String mærke) {
        Mærke = mærke;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getÅrgang() {
        return Årgang;
    }

    public void setÅrgang(int årgang) {
        Årgang = årgang;
    }

    public int getAntalDøre() {
        return antalDøre;
    }

    public void setAntalDøre(int antalDøre) {
        this.antalDøre = antalDøre;
    }
}
