/*
 * 3. Write a Java program where one thread prints only even numbers and another prints only odd numbers from 1 to 20. 
 * Synchronize the threads so that they print alternately (i.e., 1 2 3 4 ...).
 */
package day_12;
public class OddOrEvenPrint{
    public static void main(String[] args) {
       OddEvenPrinter printer = new OddEvenPrinter(); 
       Thread t1 = new Thread(){
        @Override
        public void run(){
            try {
                printer.even();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
       };
       Thread t2 = new Thread(){
        @Override
        public void run(){
            try {
                printer.odd();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
       };
       t1.start();
       t2.start();
    }   
}
class OddEvenPrinter{
    public static int num = 1;
    public synchronized void even() throws InterruptedException{
        while(num<=20){
            if(num%2 == 0){
                System.out.println("Even ---->"+num);
                num++;
                notify();
            }
            else{
                wait();
            }
        }
    }
    public synchronized void odd() throws InterruptedException{
        while(num<=20){
            if(num%2 != 0){
                System.out.println("Odd ---->"+num);
                num++;
                notify();
            }
            else{
                wait();
            }
        }
    }
}

