package com.company;

public class BenzinBil extends Bil {

    int oktanTal;
    int kmPrL;

    public BenzinBil(String regNR, String mærke, String model, int årgang, int antalDøre, int oktanTal, int kmPrL) {
        super(regNR, mærke, model, årgang, antalDøre);
        this.oktanTal = oktanTal;
        this.kmPrL = kmPrL;
    }

    public double beregnGrønEjerafgift() {
        double afgift;
        if (this.kmPrL >= 20 && this.kmPrL <= 50) {
            afgift = 330;
        }
        else if (this.kmPrL >= 15 && this.kmPrL <= 19) {
            afgift = 1050;
        }
        else if (this.kmPrL >= 10 && this.kmPrL <= 14) {
            afgift = 2340;
        }
        else if (this.kmPrL >= 5 && this.kmPrL <= 9) {
            afgift = 5500;
        }
        else if (this.kmPrL < 5) {
            afgift = 10470;
        }
        else {
            afgift = 0;
        }
        return afgift;
    }

    @Override
    public String toString() {
        return "BenzinBil{" +
                "oktanTal=" + oktanTal +
                ", kmPrL=" + kmPrL +
                ", regNR=" + regNR +
                ", Mærke='" + Mærke + '\'' +
                ", Model='" + Model + '\'' +
                ", Årgang=" + Årgang +
                ", antalDøre=" + antalDøre +
                '}';
    }

    public int getOktanTal() {
        return oktanTal;
    }

    public void setOktanTal(int oktanTal) {
        this.oktanTal = oktanTal;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }
}
