package Day_8.Clone_method.Shallow_Copy;

public class Address implements Cloneable{
    public String city;
    public String state;
    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }
}
