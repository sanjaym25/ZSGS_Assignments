/*
 1. Write a Java program
a. to create a new array list, add some colours (string) and print out the collection.
b. to iterate through all elements in an array list.
c. to insert an element into the array list at the first position.
d. to retrieve an element (at a specified index) from a given array list.
e. to update specific array element by given element.
f. to remove the third element from an array list.
g. to search an element in an array list.
h. to sort a given array list.
i. to copy one array list into another.
j. to shuffle elements in an array list
*/

package day_10.arrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ArrayListOperations{
    static Scanner scan = new Scanner(System.in);
    static ArrayList<String> colors = new ArrayList<>();
    public static void createArryList(){
        System.out.print("Enter The How Many Colors : ");
        int n = scan.nextInt();
        scan.nextLine();
        for(int i = 0;i<n;i++){
            try{
            System.out.print("Enter The color "+(i+1)+" : ");
            String color = scan.nextLine();
            colors.add(color);
            }
            catch(InputMismatchException e){
                System.out.println("Input Miss Match Try Again : "+e.getMessage());
            }
        }
    }
    public static void showAllElement(){
        System.out.print("{ ");
        for(String color : colors){
            System.out.print(color+", ");
        }
        System.out.print("}");
    }

    public static void main(String[] args) {
        int choice;
        do{
        System.out.println("\nChoose an operation:");
        System.out.println("1. Add colors and print");
        System.out.println("2. Iterate all elements");
        System.out.println("3. Insert element at first position");
        System.out.println("4. Retrieve element at index");
        System.out.println("5. Update specific element");
        System.out.println("6. Remove third element");
        System.out.println("7. Search element");
        System.out.println("8. Sort array list");
        System.out.println("9. Copy one array list to another");
        System.out.println("10. Shuffle elements");
        System.out.println("11. Exit");

        System.out.print("Enter the Choice : ");
        choice = scan.nextInt();
        scan.nextLine();
        try{
        switch (choice) {
            case 1:
                // a. Add colors and print
                createArryList();
                showAllElement();
                break;
            case 2:
                // b. Iterate elements
                showAllElement();
                break;
            case 3:
                // c. Insert at first position
                System.out.print("Insert Color In first Postion :");
                colors.add(0,scan.nextLine());
                System.out.println("***    Insert at first position SuccessFully   ****");
                break;
            case 4:
                // d. Retrieve at index
                System.out.print("Retrieve at index :");
                System.out.println("Retrieve at index : "+colors.get(scan.nextInt()));
                scan.nextLine();
                break;
            case 5:
                // e. Update element
                System.out.print("Enter The Update Index : ");
                int idx = scan.nextInt();
                scan.nextLine();
                System.out.println("Enter The Update Value : ");
                String value = scan.nextLine();
                colors.set(idx, value);
                break;
            case 6:
                // f. Remove third element
                System.out.println("Remove third element : "+colors.remove(2));

                break;
            case 7:
                // g. Search element
                System.out.println("Search element : "+ colors.contains(scan.nextLine()));
                break;
            case 8:
                // h. Sort array list
                Collections.sort(colors,String.CASE_INSENSITIVE_ORDER);
                System.out.println("Sort array list");
                System.out.println(colors);
                break;
            case 9:
                ArrayList<String> copyList = new ArrayList<>();
                copyList.addAll(colors);
                System.out.println("Copied List ");
                System.out.println(copyList);
                // i. Copy array list
                break;
            case 10:
                // j. Shuffle elements
                Collections.shuffle(colors);
                System.out.println("Shuffle elements");
                System.out.println(colors);
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }       
        }
        catch(InputMismatchException e){
            System.out.println("Input Miss match : "+e.getMessage());
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bouns : "+e.getMessage());
        }
        catch(Exception e){
            System.out.println("Error Ocurred : "+e.getMessage());
        }  
    }
    while (choice<11);
    }
}
