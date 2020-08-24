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
public class Sword extends Weapon {

    public Sword() {
        this(100);
    }

    public Sword(int Atk) {
        this.atk = Atk;
        this.description = "Melee Weapon Shink! Shink!";
    }

    /**
     *
     * @return
     */
    @Override
    public Weapon Clone() {
        System.out.println("Activate Skill Gate of Babilone");
        Sword newSword = new Sword(this.atk);
        return newSword;
    }

    public void boot() {
        this.atk += 1;
        System.out.println("Boot Boot Bootooo!");
    }

}
