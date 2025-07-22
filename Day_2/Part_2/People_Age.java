/*
 8. Write a program which takes in 10 people’s age and gives number of people who are <18, 18-60, >60.
 */
package Day_2.Part_2;

import java.util.Scanner;

public class People_Age {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int [] age = getPeopleAge();
        peopleAgeSatisfied(age);
    }
    // Get People Age Method

    public static int[] getPeopleAge(){
        System.out.print("Enter The Pepole Age Array Size :");
        int size = scan.nextInt();
        int [] age = new int[size];
        for(int i = 0;i<age.length;i++){
           System.out.print("Enter The Age :"); 
           age[i] = scan.nextInt();
        }
        return age;
    }
    
    // Check Peple Age Satisfied

    public static void  peopleAgeSatisfied(int [] age){
        int less_18 = 0;
        int above_18_To_60 = 0;
        int above_60 = 0;
        for(int i = 0;i<age.length;i++){
            if(age[i]<18) less_18++;
            else if(age[i]>=18 && age[i]<=60) above_18_To_60++;
            else  above_60++;  
        }
        System.out.println("People Age LessThan 18 : "+less_18);
        System.out.println("People Age Above 18 To 60 : "+above_18_To_60);
        System.out.println("People Age Above  60 : "+above_60);

    }
}
