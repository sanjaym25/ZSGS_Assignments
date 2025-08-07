package Day_7.Tickect_Booking;

public abstract class Tickect {
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
        this.destination = destination;
        this.seetId = seetId;
    }


    public abstract void bookTickect();
}
