package AverageList;

import java.util.ArrayList;

public class StringList<T> extends AverageOfList<T> {

    ArrayList<String> list= new ArrayList<>();

    public void add(String string){
        list.add(string);
    }

    @Override
    public void toIntList() {
        for (String string : list) {
            intList.add(string.length());
        }
    }

    @Override
    public void getAverage() {
        toIntList();
        int sum = 0;
        for (int i : intList) {
            sum += i;
        }
        System.out.println(sum / intList.size());
    }
}
