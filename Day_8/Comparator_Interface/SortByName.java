package Day_8.Comparator_Interface;
import java.util.Comparator;
public class SortByName implements Comparator<Student> {
    @Override
    public int compare(Student obj, Student obj2){
        return obj.name.compareTo(obj2.name);
    } 
}
