package Day_5.Hospital_Managment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class InPatientRecord extends MedicalRecord {

    private int roomNumber;
    private int numberOfDaysAdmitted;
    private double roomCharges;
    double totalCharges;

    public InPatientRecord() {
        super();
    }

    public InPatientRecord(int roomNumber, int numberOfDaysAdmitted, double roomCharges) {
        this.roomNumber = roomNumber;
        this.numberOfDaysAdmitted = numberOfDaysAdmitted;
        this.roomCharges = roomCharges;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumberOfDaysAdmitted() {
        return numberOfDaysAdmitted;
    }

    public void setNumberOfDaysAdmitted(int numberOfDaysAdmitted) {
        this.numberOfDaysAdmitted = numberOfDaysAdmitted;
    }

    public double getRoomCharges() {
        return roomCharges;
    }

    public void setRoomCharges(double roomCharges) {
        this.roomCharges = roomCharges;
    }

    public void inpatientDetails() {
        super.inputRecordDetails();

        System.out.print("Enter Room Charges : ");
        this.roomCharges = scan.nextDouble();

        while (true) {
            System.out.print("Enter Room Number  : ");
            this.roomNumber = scan.nextInt();
            scan.nextLine();

            if (!Medical_Main.roomStatus.containsKey(this.roomNumber) || !Medical_Main.roomStatus.get(this.roomNumber)) {
                Medical_Main.roomStatus.put(this.roomNumber, true);
                Medical_Main.patientList.add(this);
                Medical_Main.medicalList.add(this);
                break;
            } else {
                System.out.println("Room already occupied! Try another.");
            }
        }
    }

    public double calculateTotalCharges() {
        System.out.print("Enter the Record Id : ");
        int recordId = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter Discharge Date (DD-MM-YYYY) : ");
        String discharge = scan.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        for (MedicalRecord record : Medical_Main.medicalList) {
            if (record.getRecordId() == recordId && record instanceof InPatientRecord) {
                InPatientRecord ip = (InPatientRecord) record;

                LocalDate admissionDate = LocalDate.parse(ip.getDateOfVisit(), formatter);
                LocalDate dischargeDate = LocalDate.parse(discharge, formatter);

                int days = (int) ChronoUnit.DAYS.between(admissionDate, dischargeDate) + 1;
                ip.setNumberOfDaysAdmitted(days);
                ip.totalCharges = days * ip.getRoomCharges();

                Medical_Main.roomStatus.put(ip.getRoomNumber(), false);

                return ip.totalCharges;
            }
        }

        return 0.0;
    }

    @Override
    public void displayRecord() {
        super.displayRecord();
        System.out.printf("Room Number      : %d\n", this.roomNumber);
        System.out.printf("Room Charges     : %.2f\n", this.roomCharges);
        System.out.printf("Days Admitted    : %d\n", this.numberOfDaysAdmitted);
        System.out.printf("Total Charges    : %.2f\n", this.calculateTotalCharges());
    }
}
