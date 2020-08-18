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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Random;

public class ObjectPoolDemo {

    private ObjectPool<Process> pool;
    private AtomicLong processNo = new AtomicLong(0);

    public void setUp() {
        ExportingProcess e = new ExportingProcess();
        Test t = new Test();
        System.out.println(e.getName());
        System.out.println(t.getName());
        pool = new ObjectPool<Process>(10, 10, 5) {
            protected Process createObject() {
                // create a test object which takes some time for creation  
                Random rand = new Random();
                int rand_int = rand.nextInt(2);
                if (rand_int == 0) {
                    return e.clone();
                } else {
                    return t.clone();
                }

            }
        };
    }

    public void tearDown() {
        pool.shutdown();
    }

    public void testObjectPool() {
        ExecutorService executor = Executors.newFixedThreadPool(8);

        // execute 8 tasks in separate threads  
//        executor.execute(new ExportingTask(pool, 1));
//        executor.execute(new ExportingTask(pool, 2));
//        executor.execute(new ExportingTask(pool, 3));
//        executor.execute(new ExportingTask(pool, 4));
//        executor.execute(new ExportingTask(pool, 5));
//        executor.execute(new ExportingTask(pool, 6));
//        executor.execute(new ExportingTask(pool, 7));
//        executor.execute(new ExportingTask(pool, 8));
//        for (int i = 0; i < 10; i++) {
//            executor.execute(new ExportingTask(pool, 1));
//        }
        executor.execute(new ExportingTask(pool, 1));

        executor.shutdown();
        try {
            executor.awaitTermination(30, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        ObjectPoolDemo op = new ObjectPoolDemo();
        op.setUp();
        op.tearDown();
        op.testObjectPool();
        Connection c = Connection.getInstance();

        System.out.println(c.getNumber());
    }
}//End of the ObjectPoolDemo class. 
