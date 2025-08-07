package day_12.producer_consumer;

class Atm {
    private  int status = 1;
    public synchronized void pin() throws InterruptedException{
        while (status != 1) wait();
            System.out.println("PIN Verifier.....");
            status = 2;
            notifyAll();
            Thread.sleep(1000);
    }   
    public synchronized void withraw() throws InterruptedException{
        while(status != 2) wait();
            System.out.println("Withraw Processing.....");
            status = 3;
            notifyAll();
            Thread.sleep(1000);
    }   
    public synchronized void balance() throws InterruptedException{
        while(status != 3) wait();
            System.out.println("Balance View.....");
            status = 4;
            notifyAll();
            Thread.sleep(1000);
    }   
    public synchronized void recipet() throws InterruptedException{
        while(status != 4) wait();
            System.out.println("Recipet Printing....");
            notifyAll();
            Thread.sleep(1000);
    }

}


