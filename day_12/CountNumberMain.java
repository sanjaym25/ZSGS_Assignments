/*4. Create a Java program with a shared counter. Spawn 3 threads, where each thread increments the counter 1000 times.
 Use synchronization to avoid race conditions and display the final value.*/
package day_12;

class CountNumber implements Runnable {
    static int count;
    @Override
    public synchronized void run(){
        for(int i = 0;i<1000;i++){
            count++;
        }
    }
}
public class CountNumberMain{
    public static void main(String[] args) throws InterruptedException {
        Runnable countNumber = new CountNumber();
        Thread t1 = new Thread(countNumber);
        Thread t2 = new Thread(countNumber);
        Thread t3 = new Thread(countNumber);
        t1.start();
        t2.start();
        t3.start();   
        t1.join();
        t2.join();
        t3.join();
        System.out.println("Count :"+ CountNumber.count);
    }
}

