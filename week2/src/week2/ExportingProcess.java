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
public class ExportingProcess extends Process {

    public ExportingProcess() {
        this.name = "type1";
    }

    public Process clone() {
        Connection c = Connection.getInstance();

        System.out.println(c.getNumber());

        return new ExportingProcess();
    }
}
