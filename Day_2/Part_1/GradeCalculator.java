/*
 7. Use both if and switch case statement  as two ways to find the grade of a student.
Percent>=85 && Percent<=100 Grade ‘A’
Percent>=70 Grade ‘B’
Percent>=50 Grade ‘C’
otherwise print ”Fail”
 */
package Day_2.Part_1;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Your Precentage : ");
        gradebyIf(scan.nextInt());
    }
    // Check if else Grade
    
    public static void gradebyIf(int percentage){
        String grade = "";
        // Check the Garde using If else
        if(percentage>=85 && percentage<=100) grade = "A";
        else if(percentage>=70 && percentage<85) grade = "B";
        else if(percentage>=50 && percentage<70) grade = "C";
        else grade = "Fail";
        System.out.println("Grade : "+grade);
    }
    // Switch Using Check Grade
    public static void gradeBySwitch(int percentage){
        String grade = "";
        // convert To 1-10 
        int val =  percentage/10;
        // Check 85 t0 100 Remainter check
        int rem =  percentage%10;
        // Change correct value Update
        val = (val == 8 && rem>=5)? 8 : 7;
        switch (val) {
            case 10:
            case 9:
            case 8:
                System.out.println("Grade : A");
                break;
            case 7:
                System.out.println("Grade : B");
                break;
            case 6:
            case 5:
                System.out.println("Grade : C");   
            default:
                System.out.println("Grade : Fail"); 
                break;
        }
    }
}
