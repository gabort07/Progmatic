package company.Indians;
import java.util.Comparator;
import java.util.LinkedList;

public class IndianComparatorByAge implements Comparator<Indian> {

    public int  compare(Indian o1, Indian o2) {
        return o1.getAge()-o2.getAge();
    }


}
