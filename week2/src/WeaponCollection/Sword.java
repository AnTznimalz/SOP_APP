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
        this(1);
    }

    public Sword(int Atk) {
        this.name = "Excalibor";
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
        this.atk += 10000;
        System.out.println("Boot Boot Bootooo!");
    }

}
