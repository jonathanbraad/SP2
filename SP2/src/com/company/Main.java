package com.company;

public class Main {

    public static void main(String[] args) {
	Garage garage = new Garage();
    BenzinBil bil1 = new BenzinBil("AN94321", "Toyota", "Corolla", 2018, 4, 95, 25);
    ElBil bil2 = new ElBil("AK44132", "Tesla", "x", 2020, 4, 100, 652, 250);
    DieselBil bil3 = new DieselBil("AB41329", "BMW", "coupé", 2015, 4, false, 19);

        garage.tilføjBil(bil1);
        garage.tilføjBil(bil2);
        garage.tilføjBil(bil3);

        System.out.println(garage.toString());
        System.out.println(garage.beregnGrønAfgiftForBilpark());
    }
}
