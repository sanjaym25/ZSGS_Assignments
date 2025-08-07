package Day_5.Tickect_Booking;

public class Tickect {
    protected String name;
    protected int age;
    protected String gender;
    protected String tickectId;
    protected String destination;
    protected static String source = "Tenkasi";
    static int id = 1000;
    protected String seetId;
    Tickect(){

    }
 
    public Tickect(String name, int age, String gender, String tickectId, String destination,String seetId) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.tickectId = tickectId;
        this.destination = source;
        this.seetId = seetId;
    }


    public void bookTickect(){
        System.out.println("Book Tickect");
    }
}
