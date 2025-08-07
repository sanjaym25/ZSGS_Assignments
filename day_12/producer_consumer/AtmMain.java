/*
 * 5. Implement a basic producer-consumer problem using wait() and notify().
--->Producer thread should add items to a shared buffer.
--->Consumer thread should remove items.
Ensure the buffer size is limited to 5 items.. Use Threads to implement the ATM, where you create threads to check the PIN, another thread to perform the cash withdrawal, 
another one to check the balance amount and print the receipt.
 */
package day_12.producer_consumer;

public class AtmMain {
    public static void main(String[] args) throws InterruptedException {
        Atm atm = new Atm();
        Thread t1 = new Thread() {
            public void run() {
                try {
                    atm.pin();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        Thread t2 = new Thread() {
            public void run() {
                try {
                    atm.withraw();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t3 = new Thread() {
            public void run() {
                try {
                    atm.balance();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t4 = new Thread() {
            public void run() {
                try {
                    atm.recipet();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println("Thanking You .....");

    }
}
