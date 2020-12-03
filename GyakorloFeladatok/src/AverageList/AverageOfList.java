package AverageList;

import java.util.ArrayList;

public abstract class AverageOfList<T> implements Converter{
    ArrayList<T> tList = new ArrayList<>();
    ArrayList<Integer> intList = new ArrayList<>();

    public void getAverage(){}

    @Override
    public void toIntList(){}

}
