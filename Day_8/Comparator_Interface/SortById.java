package Day_8.Comparator_Interface;
import java.util.Comparator;
public class SortById implements Comparator<Student> {

    @Override
    public int compare(Student obj,Student obj2){
        return obj.id - obj2.id;
    }
    
}
