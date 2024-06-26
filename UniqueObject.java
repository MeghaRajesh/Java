import java.util.List;
import java.util.TreeSet;

public class UniqueObject {
    public static void main(String[] args){
        List <Integer> arr =List.of(1,1,2);
        TreeSet <Integer> arrSet = new TreeSet<>(arr);
        System.out.println(arrSet);
    }
}
