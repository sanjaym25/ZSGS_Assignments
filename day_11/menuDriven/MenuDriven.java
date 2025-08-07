/*
 2. Write a Menu driven Java program a) to read content from the user and write it into another file and b) from the file to another file c) to modify the content of a file d) to search for a particular word in a file and display how many times it appears e) read the content(List of Electronic Products) of a .txt file and copy them to the .csv file.
 */
package menuDriven;

import java.io.*;
import java.util.ArrayList;

public class MenuDriven {
    public File createFile(File file) throws IOException {
        if (file == null) {
            file = new File("day_11\\TextFile\\menu.txt");
            file.createNewFile();
            System.out.println("File created SuccessFully");
            return file;
        }
        System.out.println("File Already Exits");
        return file;
    }

    public  void writeFile(File file, String writer) throws IOException {
        FileWriter fWriter = new FileWriter(file, true);
        BufferedWriter bWriter = new BufferedWriter(fWriter);
        bWriter.write(writer);
        bWriter.newLine();
        bWriter.flush();
        bWriter.close();
    }

    public  void copycontentAnotherFile(File file) throws IOException {
        File f2 = new File("day_11\\TextFile\\copy.txt");
        FileReader fReader;
        try {
            f2.createNewFile();
            FileWriter fWriter = new FileWriter(f2);
            BufferedWriter bWriter = new BufferedWriter(fWriter);
            fReader = new FileReader(file);
            BufferedReader bReader = new BufferedReader(fReader);
            String line ;
            System.out.println(file);
            while ((line=bReader.readLine()) != null) {
                System.out.println(line);
                bWriter.write(line);
                bWriter.newLine();
            }
            bWriter.flush();
            bWriter.close();
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
    }

    public void motifideContent(File file, String oldData, String newData) {
        try {
            //BufferdsReader using file Read
            FileReader fReader = new FileReader(file);
            BufferedReader bReader = new BufferedReader(fReader);

             // Create the File The data Strore File First
            ArrayList<String> list = new ArrayList<>();
            String line;
            // Read data update List
            while ((line = bReader.readLine()) != null) {
                System.out.println(line);
                String changed = line.replaceAll("\\b"+oldData+"\\b",newData);
                System.out.println(changed);
                list.add(changed);
            }
            bReader.close();
            //BufferedWriter using file Write
            FileWriter fWriter = new FileWriter(file);
            BufferedWriter bWriter = new BufferedWriter(fWriter);
            // same file read
            for (String li : list) {
                bWriter.write(li);
                bWriter.newLine();
            }
            bWriter.flush();
            bWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public  void searchWordCount(File file,String word){
        FileReader fReader;
        try {
            int count = 0;
            fReader = new FileReader(file);
            BufferedReader bReader = new BufferedReader(fReader);
            String line;
            while ((line = bReader.readLine()) != null) {
                String [] words = line.split(" ");
                for(String s : words){
                    if(s.equals(word)){
                        count++;
                    }
                }
            }
            System.out.println("Count Serach Word : "+count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
       
    }

     public  void txtFileToCsvFile(File file) throws IOException {
        File f2 = new File("day_11\\TextFile\\copy.csv");
        FileReader fReader;
        try {
            f2.createNewFile();
            FileWriter fWriter = new FileWriter(f2);
            BufferedWriter bWriter = new BufferedWriter(fWriter);
            fReader = new FileReader(file);
            BufferedReader bReader = new BufferedReader(fReader);
            String line = bReader.readLine();
            while (line != null) {
                String csvFile = line.replaceAll(" ", ",");
                bWriter.write(csvFile);
                bWriter.newLine();
                line = bReader.readLine();
            }
            bWriter.flush();
            bWriter.close();
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
    }
}
                    