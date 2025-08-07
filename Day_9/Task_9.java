/*
9. Create a method to read a file from disk. Handle FileNotFoundException and IOException using try-catch-finally.
*/
package Day_9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Task_9 {
    public static void main(String[] args) {
        try{
            File file = new File("Day_9/sample.txt");
            FileInputStream read = new FileInputStream(file);
            System.out.println("File Already exits");
        }
        catch(FileNotFoundException e){
            System.out.println("Flie Not Found : "+e.getMessage());            
        }
        finally{
            System.out.println("Excuted SuccussFully");
        }
    }
}
