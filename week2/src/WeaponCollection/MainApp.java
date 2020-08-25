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
public class MainApp {

    public static void main(String[] args) {
        WeaponMarget market = WeaponMarget.getInstance();
        System.out.println(market);
        Gun g = new Gun();
        market.OrderWeapon(g, 2);
        System.out.println(market.getCountWeapon());
        Sword s = new Sword();
        s.boost();
        market.OrderWeapon(s, 5);
        System.out.println(market);

        Player player1 = new Player("player1");
        player1.Equip();
        player1.Equip();
        System.out.println(market);
        Player player2 = new Player("player2");
        player2.Equip();
        player2.Equip();
        player2.Equip();
        player1.unEquip();
        player1.showStat();
        player2.showStat();
    }

}
