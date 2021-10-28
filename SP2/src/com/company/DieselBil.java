package com.company;

public class DieselBil extends Bil{
    boolean harPartikelFilter;
    int kmPrL;

    public DieselBil(String regNR, String mærke, String model, int årgang, int antalDøre, boolean harPartikelFilter, int kmPrL) {
        super(regNR, mærke, model, årgang, antalDøre);
        this.harPartikelFilter = harPartikelFilter;
        this.kmPrL = kmPrL;
    }

    public double beregnGrønEjerafgift() {
        double afgift;
        if (this.kmPrL >= 20 && this.kmPrL <= 50) {
            afgift = 460;
        }
        else if (this.kmPrL >= 15 && this.kmPrL <= 19) {
            afgift = 1050 + 1390;
        }
        else if (this.kmPrL >= 10 && this.kmPrL <= 14) {
            afgift = 2340 + 1850;
        }
        else if (this.kmPrL >= 5 && this.kmPrL <= 9) {
            afgift = 5500 + 2770;
        }
        else if (this.kmPrL < 5) {
            afgift = 10470 + 15260;
        }
        else {
            afgift = 0;
        }
        if (!this.harPartikelFilter) {
            afgift = afgift + 1000;
        }
        return afgift;
    }

    @Override
    public String toString() {
        return "DieselBil{" +
                "regNR=" + regNR +
                ", Mærke='" + Mærke + '\'' +
                ", Model='" + Model + '\'' +
                ", Årgang=" + Årgang +
                ", antalDøre=" + antalDøre +
                ", harPartikelFilter=" + harPartikelFilter +
                ", kmPrL=" + kmPrL +
                '}';
    }

    public boolean isHarPartikelFilter() {
        return harPartikelFilter;
    }

    public void setHarPartikelFilter(boolean harPartikelFilter) {
        this.harPartikelFilter = harPartikelFilter;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }
}
