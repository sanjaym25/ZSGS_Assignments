package Day_6.Travels.Travel_User;
import Day_6.Travels.Travel_Booking.Tickect;
import Day_6.Travels.MainApp.DB;
public class User extends Tickect{
    private String name;
    private int age;
    private String emailId;
    private String contactNo;
    static int id = 10000;
    User user;
    public User(){
        super();
    }
    public User(String name, int age, String emailId, String contactNo,String tickectId,String destination,double fare) {
        super(tickectId, destination, fare);
        this.name = name;
        this.age = age;
        this.emailId = emailId;
        this.contactNo = contactNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public String getContactNo() {
        return contactNo;
    }
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
    public void bookTickect(String name,int age,String emailId,String contactNo,String destination){
        double fare = 0;
        if(destination.toLowerCase().equals("chennai")){
            fare = 500;
        }
        else if(destination.toLowerCase().equals("mumbai")){
            fare = 600;
        }
        else if(destination.toLowerCase().equals("thirchy")){
            fare = 400;
        }
        else if(destination.toLowerCase().equals("madurai")){
            fare = 300;
        }

        user = new User(name, age, emailId, contactNo, "TCID"+(++id), destination,fare);
        
        DB.user.add(user);
    }
    public void displayDetails() {
        System.out.println("\n--- User & Ticket Details ---");
        System.out.println("Name        : " + user.name);
        System.out.println("Age         : " + user.age);
        System.out.println("Email ID    : " + user.emailId);
        System.out.println("Contact No  : " + user.contactNo);
        System.out.println("Ticket ID   : " + user.getTickectId());
        System.out.println("Destination : " + user.getDestination());
        System.out.println("Fare        : ₹" + user.getFare());
    } 
}
