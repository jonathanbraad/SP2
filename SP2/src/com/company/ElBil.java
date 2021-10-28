package com.company;

public class ElBil extends Bil{

    int batterikapacitetKWh;
    int maxKm;
    int whPrKm;

    public ElBil(String regNR, String mærke, String model, int årgang, int antalDøre, int batterikapacitetKWh, int maxKm, int whPrKm) {
        super(regNR, mærke, model, årgang, antalDøre);
        this.batterikapacitetKWh = batterikapacitetKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    public double beregnGrønEjerafgift() {
        double afgift;
        double kmPrL = 100 / (this.whPrKm / 91.25);
        if (kmPrL >= 20 && kmPrL <= 50) {
            afgift = 330;
        }
        else if (kmPrL >= 15 && kmPrL <= 19) {
            afgift = 1050;
        }
        else if (kmPrL >= 10 && kmPrL <= 14) {
            afgift = 2340;
        }
        else if (kmPrL >= 5 && kmPrL <= 9) {
            afgift = 5500;
        }
        else if (kmPrL < 5) {
            afgift = 10470;
        }
        else {
            afgift = 0;
        }
        return afgift;
    }

    @Override
    public String toString() {
        return "ElBil{" +
                "regNR=" + regNR +
                ", Mærke='" + Mærke + '\'' +
                ", Model='" + Model + '\'' +
                ", Årgang=" + Årgang +
                ", antalDøre=" + antalDøre +
                ", batterikapacitetKWh=" + batterikapacitetKWh +
                ", maxKm=" + maxKm +
                ", whPrKm=" + whPrKm +
                '}';
    }

    public int getBatterikapacitetKWh() {
        return batterikapacitetKWh;
    }

    public void setBatterikapacitetKWh(int batterikapacitetKWh) {
        this.batterikapacitetKWh = batterikapacitetKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }
}
