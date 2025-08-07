/*
 * 4. Write a Java program to append a text read from the user to an 
 * existing file without overwriting the original content.
 */
import java.io.*;
import java.util.Scanner;

public class Task_4 {
    static Scanner scan = new Scanner(System.in);
    public static File createFile(File file) throws IOException{
        if(file == null){
        file = new File("day_11\\TextFile\\test.txt");
        file.createNewFile();
        System.out.println("File Created SuccssFully");
        return file;
        }
        System.out.println("File Already Exits");
        return file;
    }
    public static void writeFile(File file,String writer){
        try{
        FileWriter fWriter = new FileWriter(file,true);
        BufferedWriter bWriter = new BufferedWriter(fWriter);
        bWriter.write(writer);
        bWriter.newLine();
        bWriter.flush();
        bWriter.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void readFile(File file){
        try{
        FileReader fReader= new FileReader(file);
        BufferedReader brReader = new BufferedReader(fReader);
        String line = brReader.readLine();
        while(line != null){
            System.out.println(line);
            line = brReader.readLine();
        }
        brReader.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    
    }
    public static void main(String[] args) throws IOException {
        int choice;
        File file = null;
        do{
            System.out.println("1. Create a File ");
            System.out.println("2. Write a File ");
            System.out.println("3. Read a File ");
            System.out.println("4. Exit");
            System.out.print("Enter the Choice : ");
            choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    file = createFile(file);
                    break;
                case 2:
                    System.out.println(file);
                    System.out.print("Write a Content : ");
                    String content = scan.nextLine();
                    writeFile(file,content);;
                    break;
                case 3:
                    readFile(file);
                    break;
                default:
                    System.out.println("Exit ....");
                    break;
            }
        }
        while(choice!=4);
    }    
}

