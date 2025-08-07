/*
 1. Design a Java program to maintain hospital medical records.
Create a base class named MedicalRecord that includes common attributes:
--- recordId, patientName, dateOfVisit, and diagnosis.
--- inputRecordDetails() – to input common record information.
--- override displayRecord() – to display the common record details.
Create a subclass InPatientRecord that extends MedicalRecord and adds:
--- roomNumber, numberOfDaysAdmitted, roomCharges.
--- calculateTotalCharges() – to compute and return total inpatient cost.
--- displayRecord() – to include all details, including total charges.
Create another subclass OutPatientRecord that extends MedicalRecord and adds:
--- doctorName, consultationFee.
--- override displayRecord() – to include all outpatient-specific details.
Include all the necessary classes if it's needed.
 */
package Day_5.Hospital_Managment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Medical_Main {
    public static ArrayList<MedicalRecord> medicalList = new ArrayList<>();
    public static ArrayList<InPatientRecord> patientList = new ArrayList<>();
    public static ArrayList<OutPatientRecord> outPatientList = new ArrayList<>();
    public static HashMap<Integer, Boolean> roomStatus = new HashMap<>();

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n***** Welcome To SI Hospital *****");
            System.out.println("1. InPatient");
            System.out.println("2. OutPatient");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int n = scan.nextInt();
            scan.nextLine();

            switch (n) {
                case 1:
                    handleInPatient();
                    break;
                case 2:
                    handleOutPatient();
                    break;
                case 3:
                    System.out.println("Thank you! Visit Again.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static void handleInPatient() {
        InPatientRecord inpatientRecord = new InPatientRecord();
        inpatientRecord.inpatientDetails();

        System.out.println("*** Inpatient Admission Successful ***");

        System.out.println("1. Calculate Charges & Display");
        System.out.println("2. Back to Main Menu");
        System.out.print("Enter your choice: ");
        int choice = scan.nextInt();
        scan.nextLine();

        if (choice == 1) {
            inpatientRecord.calculateTotalCharges();
            inpatientRecord.displayRecord();
        }
    }

    public static void handleOutPatient() {
        OutPatientRecord outpatientRecord = new OutPatientRecord();
        outpatientRecord.outpatientRecordDetails();

        System.out.println("*** Outpatient Admission Successful ***");

        System.out.println("1. Display Outpatient Record");
        System.out.println("2. Back to Main Menu");
        System.out.print("Enter your choice: ");
        int choice = scan.nextInt();
        scan.nextLine();

        if (choice == 1) {
            outpatientRecord.displayRecord();
        }
    }
}

