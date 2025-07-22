package Day_2.Part_1.Pattern_Printing;
import java.util.Scanner;

public class Right_Half_Of_Diamond {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        // get The User Input Right_Half_Of_Diamond 

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number Row pattern : ");
        int n = scan.nextInt();
        System.out.print("Enter The Letter Pattern Character : ");
        char character = scan.next().charAt(0);
        System.out.println("****   Character pattern ***");

        // Right_Half_Of_Diamond Letter Pattern

        letterPattern(n,character);
    }
    
    // Letter Pattern Print Follow Logic Right_Half_Of_Diamond
    
    public static void letterPattern(int n,char character){
        int top = n%2 != 0?(n/2)+1:n/2;
        int bottom = n%2 == 0?(n/2):n/2;
        int i = 0;
        while(top-- > 0){
            i++;
            int j = 0;
            while(j++<i) System.out.print(character+" ");
            System.out.println();                    
        }
         while(bottom > 0){
            int j = 0;
            while(j++<bottom) System.out.print(character+" ");
            System.out.println();
            bottom--;                    
        }
    }
}
