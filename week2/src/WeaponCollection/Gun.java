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
public class Gun extends Weapon {

    private int ammo;

    public Gun() {
        this.atk = 500;
        this.description = "Range Weapon piw piw!!";
        this.ammo = 5;
    }

    /**
     *
     * @return
     */
    @Override
    public Weapon Clone() {
        System.out.println("Take my money and get more One");
        Gun newGun = new Gun();
        return newGun;
    }

    public void fire() {
        if (ammo > 0) {
            System.out.println("Punk! Punk!");
            this.ammo -= 1;
        } else {
            System.out.println("Reloaded");
        }
    }

}