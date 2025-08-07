package Day_8.Comparator_Interface;
import java.util.Comparator;
public class SortByAge implements Comparator<Student>{
    @Override
    public int compare(Student obj,Student obj2){
        return obj.age - obj2.age;
    }
}

