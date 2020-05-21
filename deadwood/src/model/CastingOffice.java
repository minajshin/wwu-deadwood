package model;

import java.util.*;

public class CastingOffice extends Location {

    private int[] credits = { 0, 0, 5, 10, 15, 20, 25 }; // array to keep track of price of upgrade in credits
    private int[] dollars = { 0, 0, 4, 10, 18, 28, 40 }; // array to keep track of price of upgrade in dollars

    public CastingOffice(String name, int x, int y) {
        super(name, x, y);
    }

    // handles upgrade requests and checks for validity
    // returns true if successfully upgraded, false if failed
    public boolean upgrade(Player p, int newRank, int choice) {
        if (choice == 2) {// pay with credit
            if (p.getCredits() < credits[newRank]) {// not enough credit
                return false;
            } else {// upgrade players rank
                p.setRank(newRank);
                int newcred = p.getCredits() - credits[newRank];// deduct price
                p.setCredits(newcred);
                return true;
            }
        } else {
            if (p.getDollars() < dollars[newRank]) {// not enough money
                return false;
            } else {
                p.setRank(newRank);// upgrade
                int newdol = p.getDollars() - dollars[newRank];// deduct price
                p.setDollars(newdol);
                return true;
            }
        }
    }
}