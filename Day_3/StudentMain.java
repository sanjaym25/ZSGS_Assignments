/*
 2. Create a class named Student that has the following attributes:
name (String)
roll_no (int)
phone_no (int)
address (String)
Create a constructor Student(String name, int roll_no, int phone_no, String address) and store and display the details for two students having names "Sam" and "John" respectively.
 */
package Day_3;
import Day_3.Student;
public class StudentMain {
    public static void main(String[] args) {
        // Default Constructor
        Student student = new Student();
        // Assign  The Value
        student.rollNo = 242;
        student.name = "sanjai";
        // Create The Object Passing value Of Parametrized Constructor
        Student stud1 = new Student("Indhu",25,6374388946l,"Mathalamparai");
        stud1.display();
        Student stud2 = new Student("Sanjai",74,6374388946l,"Mathalamparai");
        stud2.display();
    } 
}
