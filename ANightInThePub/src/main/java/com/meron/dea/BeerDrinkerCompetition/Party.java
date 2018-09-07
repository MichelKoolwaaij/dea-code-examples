package com.meron.dea.BeerDrinkerCompetition;

import java.util.ArrayList;

public class Party {

    private Keg keg;
    private ArrayList<BeerDrinker> drinkers;

    public static void main(String[] args) {
        Party party = new Party();
        party.startParty();
    }

    /**
     * Create a new Party
     */
    public Party() {
        initKeg();
        initBeerdrinkers();
    }


    /**
     * Start the party
     */
    public void startParty() {
        while (keg.getRemainingVolume() > 0) {
            for (BeerDrinker drinker : this.drinkers) {

                if (keg.getRemainingVolume() > 0) {
                    drinker.tapBeer();
                } else {
                    break;
                }
            }
        }
        for (BeerDrinker drinker : this.drinkers) {
            drinker.drank();
        }
    }

    private void initKeg() {
        this.keg = new Keg(50000);
    }

    private void initBeerdrinkers() {
        this.drinkers = new ArrayList<BeerDrinker>();

        drinkers.add(new BeerDrinker("Jannick", keg));
        drinkers.add(new BeerDrinker("Daniel", keg));
        drinkers.add(new BeerDrinker("Valerie", keg));
        drinkers.add(new BeerDrinker("Jeroen", keg));
        drinkers.add(new BeerDrinker("Tom", keg));
    }
}
