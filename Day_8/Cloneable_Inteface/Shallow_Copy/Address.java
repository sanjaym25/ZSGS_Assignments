package Day_8.Cloneable_Inteface.Shallow_Copy;

public class Address implements Cloneable{
    public String city;
    public String state;
    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }
}
