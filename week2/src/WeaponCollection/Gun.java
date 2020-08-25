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
        this.name = "AK47";
        this.atk = 100;
        this.description = "Range Weapon";
        this.ammo = 5;
    }

    /**
     *
     * @return
     */
    @Override
    public Weapon Clone() {
        System.out.println("Replica");
        Gun newGun = new Gun();
        return newGun;
    }

}
