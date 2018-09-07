package com.meron.dea.BeerDrinkerCompetition;

import java.util.ArrayList;

public class Party {

    private Keg keg;
    private ArrayList<BeerDrinker> drinkers;

    /**
     * Create a ne Party
     */
    public Party() {
        initKeg();
        initBeerdrinkers();
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

    public void startParty() {
        for (BeerDrinker drinker : this.drinkers) {
            new Thread(drinker).start();
        }
    }

    public static void main(String[] args) {
        Party party = new Party();
        party.startParty();
    }
}
