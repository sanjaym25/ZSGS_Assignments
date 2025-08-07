package Day_6.User_Define_Package.stringutility;

public class Reverse {
    public String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
