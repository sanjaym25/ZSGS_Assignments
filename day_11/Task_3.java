/*
 * 3. Write a Java program that reads a file and prints the number of lines, 
 * words, and characters.
 */

import java.io.*;
import java.util.Scanner;

public class Task_3 {
    static Scanner scan = new Scanner(System.in);
    public static File createFile(File file) throws IOException{
        file = new File("TextFile\\test.txt");
        file.createNewFile();
        System.out.println("File Created SuccssFully");
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
    public static void numberOfWord(File file){
        try{
        FileReader fReader= new FileReader(file);
        BufferedReader brReader = new BufferedReader(fReader);
        String line = brReader.readLine();
        int wordCount = 0;
        while(line != null){
            wordCount += line.split(" ").length;
            line = brReader.readLine();
        }
        brReader.close();
        System.out.println("Word Count  : "+wordCount);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void numberOfcharacter(File file){
        try{
        FileReader fReader= new FileReader(file);
        BufferedReader brReader = new BufferedReader(fReader);
        String line = brReader.readLine();
        int charactersCount = 0;
        while(line != null){
            charactersCount+=line.length();
            line = brReader.readLine();
        }
        System.out.println("Character Count : "+ charactersCount);
        brReader.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void numberOfLine(File file){
        try{
        FileReader fReader= new FileReader(file);
        BufferedReader brReader = new BufferedReader(fReader);
        String line = brReader.readLine();
        int numberLineCount = 0;
        while(line != null){
            numberLineCount++;
            line = brReader.readLine();
        }
        System.out.println("Number Of Line Count : "+numberLineCount);
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
            System.out.println("4. Number Of Word ");
            System.out.println("5. Number Of Character ");
            System.out.println("6. Number Of Line ");
            System.out.println("7. Exit");
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
                case 4:
                    numberOfWord(file);
                    break;
                case 5:
                    numberOfcharacter(file);
                    break;
                case 6:
                    numberOfLine(file);
                    break;
                default:
                    System.out.println("Exit ....");
                    break;
            }
        }
        while(choice!=7);
    }    
}
