/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeaponCollection;

/**
 *
 * @author toplo
 */
public abstract class Weapon {

    int atk;
    String description, name;

    public Weapon() {
    }

    public Weapon(int atk) {
        this(atk, "Unknow Weapon");
    }

    public Weapon(int atk, String description) {
        this.atk = atk;
        this.description = description;
    }

    public abstract Weapon Clone();
}
