package Day_8.Clone_method.Deep_Copy;

public class Address implements Cloneable{
    public String city;
    public String state;
    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
