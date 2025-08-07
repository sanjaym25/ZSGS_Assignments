//1. Write a Java program to read the contents of a text file and display it on the console.


import java.io.*;

public class ReadFile {
    public static void fileWrite(File file)throws IOException{
            FileWriter fWriter = new FileWriter(file,true);
            BufferedWriter bWriter = new BufferedWriter(fWriter);
            bWriter.write("I am Sanjai (ZSGS Student)");
            bWriter.newLine();
            bWriter.write("I From Mathalamparai ");
            bWriter.flush();
            bWriter.close();
    }
    public static void readFile(File file) throws IOException{
        FileReader fReader =  new FileReader(file);
        BufferedReader bReader = new BufferedReader(fReader);  
        String read = bReader.readLine(); 
        while(read != null){
            System.out.println(read); 
            read = bReader.readLine();
        }
        bReader.close();
    }
    public static void main(String[] args) {
        File file = new File("TextFile\\sample.txt");
        try{
        if(!file.exists()){
            file.createNewFile();
            System.out.println("File Created SuccessFully");
            // wirte the File
            fileWrite(file);
            // Read the File 
            readFile(file);
        }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
