package Day_5.Hospital_Managment;

import Day_5.Hospital_Managment.Medical_Main;

public class OutPatientRecord extends MedicalRecord {
    private String doctorName;
    private double consultationFee;

    public OutPatientRecord() {
        super();
    }

    public OutPatientRecord(String doctorName, double consultationFee) {
        this.doctorName = doctorName;
        this.consultationFee = consultationFee;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorName() {
        return this.doctorName;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }

    public double getConsultationFee() {
        return this.consultationFee;
    }

    public void outpatientRecordDetails() {
        super.inputRecordDetails();
        System.out.print("Enter Doctor Name      : ");
        this.doctorName = scan.nextLine();
        System.out.print("Enter Consultation Fee : ");
        this.consultationFee = scan.nextDouble();

        Medical_Main.outPatientList.add(this);
        Medical_Main.medicalList.add(this);
    }

    @Override
    public void displayRecord() {
        super.displayRecord();
        System.out.printf("Doctor Name       : %s\n", this.doctorName);
        System.out.printf("Consultation Fee  : %.2f\n", this.consultationFee);
    }
}

