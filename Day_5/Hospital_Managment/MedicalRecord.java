package Day_5.Hospital_Managment;

import java.util.Scanner;

public class MedicalRecord {
    Medical_Main medical_record = new Medical_Main();
    static Scanner scan = new Scanner(System.in);
    static int id = 0;
    private int recordId;
    private String patientName;
    private String dateOfVisit;
    private String diagnosis;
    MedicalRecord(){

    }
    MedicalRecord(int recordId,String patientName,String dateOfVisit,String diagnosis){
        this.recordId = recordId;
        this.patientName = patientName;
        this.dateOfVisit = dateOfVisit;
        this.diagnosis = diagnosis;
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(String dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    public void inputRecordDetails(){
        id++;
        recordId = id;
        System.out.print("Enter Patient Name : ");
        patientName = scan.nextLine();
        System.out.print("Enter dateOfVisit (DD-MM-YYYY) : ");
        dateOfVisit = scan.nextLine();
        System.out.print("Enter diagnosis : ");
        diagnosis =  scan.nextLine();
        Medical_Main.medicalList.add(new MedicalRecord(recordId, patientName, dateOfVisit, diagnosis));
    }

    public void  displayRecord(){
        System.out.println("Record Id : "+ this.recordId);
        System.out.println("Patient Name : "+ this.patientName);
        System.out.println("date Of Visit : "+ this.dateOfVisit);
        System.out.println("Diagnosis : "+ this.diagnosis);
    }
}
