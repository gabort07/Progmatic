package company.Indians;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Collection;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Indian> indians = new ArrayList<Indian>();
        indians.add(new Indian("Fekete Sólyom", 22, "Apache"));
        indians.add(new Indian("Vizes Ló", 32, "Apache"));
        indians.add(new Indian("Ülű bika", 26, "Siux"));
        for (Indian indian: indians) {
            System.out.println(indian);
        }

        Collections.sort(indians, new IndianComparatorByAge());
        System.out.println("After sort");
        for (Indian indian: indians) {
            System.out.println(indian);
        }

    }
}
