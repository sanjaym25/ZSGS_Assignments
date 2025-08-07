package day_12.producer_consumer;

import java.util.ArrayList;

public class Producer_Consumer {
    static int value = 1;
    static ArrayList<Integer> list = new ArrayList<>();

    public synchronized void add() throws InterruptedException {
        while (true) {
            if (list.size() < 5) {
                list.add(value++);
            } else if (list.size() == 5) {
                System.out.println(list);
                notify();
                wait();
                Thread.sleep(500);
            }
        }
    }

    public synchronized void remove() throws InterruptedException {
        while (true) {
            if (list.isEmpty()) {
                wait();
            }
            list.remove(0);
            System.out.println(list);
            notify();
            Thread.sleep(500);
        }

    }

    public static void main(String[] args) {
        Producer_Consumer p1 = new Producer_Consumer();
        Thread t1 = new Thread() {
            public void run() {
                try {
                    p1.add();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                try {
                    p1.remove();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        t1.start();
        t2.start();
    }
}
