/*
 * 2. Write a Menu driven Java program a) to read content from the user and write it into another file and b) from the file to another file c) to modify the content of a file d) to search for a particular word in a file and display how many times it appears e) read the content(List of Electronic Products)
 *  of a .txt file and copy them to the .csv file.
 */
package menuDriven;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File file = null;
        MenuDriven menuDriven = new MenuDriven();
        while (true) {
            System.out.println("\n---- File Operations Menu ----");
            System.out.println("1. Create File");
            System.out.println("2. Write to File");
            System.out.println("3. Modify Content");
            System.out.println("4. Copy to Another File");
            System.out.println("5. Search Word Count");
            System.out.println("6. Convert to CSV");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    file = menuDriven.createFile(file);
                    break;

                case 2:
                    if (file != null) {
                        System.out.print("Enter text to write: ");
                        String data = sc.nextLine();
                        menuDriven.writeFile(file, data);
                    } else {
                        System.out.println("Create a file first!");
                    }
                    break;

                case 3:
                    if (file != null) {
                        System.out.print("Enter word to replace: ");
                        String oldWord = sc.nextLine();
                        System.out.print("Enter new word: ");
                        String newWord = sc.nextLine();
                        menuDriven.motifideContent(file, oldWord, newWord);
                    } else {
                        System.out.println("Create a file first!");
                    }
                    break;

                case 4:
                    if (file != null) {
                        menuDriven.copycontentAnotherFile(file);
                    } else {
                        System.out.println("Create a file first!");
                    }
                    break;

                case 5:
                    if (file != null) {
                        System.out.print("Enter word to count: ");
                        String word = sc.nextLine();
                        menuDriven.searchWordCount(file, word);
                    } else {
                        System.out.println("Create a file first!");
                    }
                    break;

                case 6:
                    if (file != null) {
                        menuDriven.txtFileToCsvFile(file);
                    } else {
                        System.out.println("Create a file first!");
                    }
                    break;

                case 7:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

   
}