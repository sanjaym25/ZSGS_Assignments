/*
 9. Write an array which takes in roll no and marks in 3 subjects for 10 students. Format and Print the roll no, total marks and average for all students in a table form.
 */
package Day_2.Part_2;

import java.util.Scanner;

public class Student_Table {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("!!!   Welcome  To Student !!!");
        studentData();
    }
    // Student Details
    public static void studentData(){
        System.out.print("Enter The How many Student : ");
        int studentCount = scan.nextInt();
        System.out.print("Enter The How many Subject : ");
        int subject = scan.nextInt();
        int[][] markList = new int[studentCount][subject];
        int rollNo[] = new int[studentCount]; 
        for(int i = 0;i<markList.length;i++){
            rollNo[i] = getRollNo();
            markList[i] = getMarkList(subject); 
        }
        display(markList,rollNo);
    }

    // Display Student Details
    public static void display(int[][] markList,int[] rollNo)
    {  
        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("%-30s %-30s %-30s \n","RollNo","Total","Average");
        System.out.println("--------------------------------------------------------------------------------");
        for(int i = 0;i<markList.length;i++){
            int total = 0;
            for(int j = 0;j<markList[i].length;j++)
            {
                total+=markList[i][j];
            }
            System.out.printf("%-30s %-30s %-30s\n",rollNo[i],total,(float)total/markList[i].length);
            System.out.println("--------------------------------------------------------------------------------");
        }
    }

    // Get Student Roll Number
    public static int getRollNo(){
        System.out.print("Enter The Student Roll Number : ");
        int rollNo = scan.nextInt();
        return rollNo;
    }

    // Get Student Mark List
    public static int[] getMarkList(int n){
        int[] markList = new int[n];
        for(int i = 0;i<n;i++){
            System.out.print("Enter the Subject Mark "+(i+1)+" : ");
            markList[i] = scan.nextInt();
        }
        return markList;
    }
}
