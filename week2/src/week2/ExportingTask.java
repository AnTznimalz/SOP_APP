/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.util.ArrayList;

/**
 *
 * @author FallenDown
 */
public class ExportingTask implements Runnable {

    private ObjectPool<Process> pool;
    private int threadNo;

    public ExportingTask(ObjectPool<Process> pool, int threadNo) {
        this.pool = pool;
        this.threadNo = threadNo;
    }

    public void run() {
        // get an object from the pool
        ArrayList<Process> exportingProcess = pool.borrowObject(10, threadNo);
        ArrayList<Process> exportingProcess1 = pool.borrowObject(4, threadNo);
        pool.returnObject(exportingProcess, threadNo);
        ArrayList<Process> exportingProcess2 = pool.borrowObject(4, threadNo);
        ArrayList<Process> exportingProcess3 = pool.borrowObject(5, threadNo);
        pool.returnObject(exportingProcess1, threadNo);
        pool.returnObject(exportingProcess2, threadNo);
        pool.returnObject(exportingProcess3, threadNo);
    }

}// End of the ExportingTask class. 
