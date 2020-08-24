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
//        word1
        WeaponMarget market1 = WeaponMarget.getInstance();
        Player player1 = new Player("player1");
        player1.Equip();
        player1.showStat();

//        word2
        WeaponMarget market2 = WeaponMarget.getInstance();
        Player player2 = new Player("player2");
        player2.Equip();
        player2.showStat();
        
        
        
        
        player1.Equip();
        player1.showStat();
//        player1.showStat();
//        player1.Equip();
        player2.unEquip();
        player1.Equip();
        player1.showStat();

    }

}
