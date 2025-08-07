/*
 1. Write a Java program to demonstrate multi-threading by extending the Thread class.
--->Create a class MyThread that extends Thread.
--->Override the run() method to display the thread name and a message five times with a delay of 500 milliseconds between prints.
--->In the main() method, create two objects of MyThread and start them.
--->Each thread prints its message independently, showing concurrent execution.
 */
package day_12;

class MyTherd extends Thread {
    @Override
    public void run(){
        for(int i = 0;i<5;i++){
            try{       
                System.out.println("Thread Name : "+this.getName());
                sleep(500); 
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class ThreadClass{
    public static void main(String[] args) {
        MyTherd t1 = new MyTherd();
        MyTherd t2 = new MyTherd();
        t1.setName("First Thread");
        t2.setName("Second Thread");
        t1.start();
        t2.start();
    }
}
