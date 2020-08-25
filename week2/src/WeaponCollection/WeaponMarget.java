/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeaponCollection;

import java.util.LinkedList;

/**
 *
 * @author toplo
 */
public class WeaponMarget {

    private static WeaponMarget instance;
    private LinkedList<Weapon> store;

    private WeaponMarget() {
        this(new Sword(), new Gun());
    }

    private WeaponMarget(Weapon p) {
        this(p, p);
    }

    private WeaponMarget(Weapon proto1, Weapon proto2) {
        System.out.println("-----------------Initial----------------");
        this.store = new LinkedList<Weapon>();
        for (int i = 0; i < 3; i++) {
            if (i % 2 == 0) {
                this.store.add(proto1.Clone());
            } else {
                this.store.add(proto2.Clone());
            }
        }
        System.out.println("-----------------Finished----------------");
    }

    public static WeaponMarget getInstance() {
        if (instance == null) {
            instance = new WeaponMarget();
        }
        return instance;
    }

    public Weapon borrowWeapon() {
        Weapon w;
        if ((w = store.poll()) == null) {
            System.out.println("Error, Store is empty please wait for return");
        }
        return w;
    }

    public void returnWeapon(Weapon w) {
        if (w == null) {
            return;
        }
        this.store.offer(w);
    }

    public void OrderWeapon(Weapon w, int number) {
        for (int i = 0; i < number; i++) {
            this.store.add(w.Clone());
        }
    }

    public int getCountWeapon() {
        return store.size();
    }

    public String toString() {
        return "Weapon Market have " + store.size() + " weapon";
    }
}
