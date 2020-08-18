/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

/**
 *
 * @author FallenDown
 */
public class Connection {

    private static Connection instance;
    private int count;

    private Connection() {
    }

    //static block initialization for exception handling
    public static Connection getInstance() {
        if (instance == null) {
            instance = new Connection();
        }
        return instance;
    }

    public int getNumber() {
        count += 1;
        return count;
    }
}
