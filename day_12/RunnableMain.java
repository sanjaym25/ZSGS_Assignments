/*
 * 2. Write a Java program to create a thread using the Runnable interface.
--->Create a class TaskRunner that implements Runnable.
--->Inside the run() method, print the current thread name and a task-specific message 10 times with a delay of 1000ms.
--->In the main() method, create two Thread objects passing different TaskRunner instances and start both threads.
--->The console should reflect the concurrent execution of both tasks.
 */
package day_12;

class TaskRunner implements Runnable {
    private String taskPermance;
    TaskRunner(String task){
        this.taskPermance = task;
    }
    @Override 
    public void run(){
        try{
            for(int i = 0;i<10;i++){
                System.out.println(Thread.currentThread().getName()+" ------ > "+taskPermance);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
public class RunnableMain{
    public static void main(String[] args) {
        Runnable thRunnable1 = new TaskRunner("File Uploading");
        Runnable thRunnable2 = new TaskRunner("File DownLoding");
        Thread t1 = new Thread(thRunnable1);  
        Thread t2 = new Thread(thRunnable2);
        t1.setName("First Thread");  
        t2.setName("Second Thread");  
        t1.start();
        t2.start();
    }
}
