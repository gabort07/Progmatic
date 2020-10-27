package company.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        List <Integer> list1 = new ArrayList<>();
        for(int i = 0; i<20; i++){
            list1.add((int)(Math.random()*50+1));
        }



    }
    public static void deletEvenNums(List<Integer> nums){
        for (int number: nums) {
            if(number%2==0){
                nums.remove(number);
            }
        }
    }
}
