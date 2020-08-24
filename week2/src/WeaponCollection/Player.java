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
public class Player {

    private int lv = 1;
    private LinkedList<Weapon> weapons;
    private int baseAtk = 10;
    private String name;

    public Player() {
        this("");
    }

    public Player(String name) {
        this.name = name;
        this.weapons = new LinkedList<Weapon>();
    }

    public int getLv() {
        return lv;
    }

    public void levelUp() {
        this.lv += 1;
    }

    public void Equip() {
        WeaponMarget market = WeaponMarget.getInstance();
        Weapon w = market.borrowWeapon();
        if (w != null) {
            this.weapons.add(w);
            System.out.println(this.name + "borrow a weapon");
        }

    }

    public void unEquip() {
        Weapon w;
        if ((w = weapons.poll()) == null) {
            System.out.println("this Player weapon is empty");
        } else {
            WeaponMarget market = WeaponMarget.getInstance();
            market.returnWeapon(w);
            System.out.println(this.name + "return a weapon");
        }
    }

    public void showStat() {
        System.out.println("Name: " + this.name);
        System.out.println("Lv." + this.lv);
        int sumAtk = this.baseAtk;
        for (Weapon weapon : weapons) {
            if (weapon != null) {
                sumAtk += weapon.atk;
            }
        }
        System.out.println("ATK is " + sumAtk);
    }
}
