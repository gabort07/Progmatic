package company;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        int[] array = {3,5,12,34,45,31,11,39};

        SelectionSort.sort(array);
        for(int i : array){
            System.out.println(i);
        }

        String a = "Alma";
        String b = "Álma";
        if(a.compareTo(b)<0) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }

        
    }
}
