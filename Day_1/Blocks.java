// 5. Write a program that illustrate the execution order of static block and initializer block?
public class Blocks {

    static{
        System.out.println("This Is Static Block !!! "); // JVM Static Block Call The First !!!
    }

    // Instance Initialization Block Create Object call The Block in before Constructer
    {
        System.out.println("This Is initialize Block Block !!! ");
    }

    // Create Object call the Constructer
    Blocks(){
         System.out.println("This Is Constructer  Block !!! ");
    }

    public static void main(String[] args) {
        System.out.println("main Method Called !!");
        Blocks block = new Blocks();
        System.out.println("Object created !!");
    }
    
}
