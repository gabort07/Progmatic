package company.Stacks_Queues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Stacks_Queue {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,5};
        Stack<Integer> numbersorders = new Stack<>();
        Stack<Integer> numbers2 = queueWithTwoStack(numbersorders);

        for(int i : nums){
            numbersorders.push(i);
        }
        for (int i = 0; i<numbersorders.capacity(); i++){
            numbers2.push(numbersorders.pop());
        }
        System.out.println(Arrays.toString(nums));

    Queue<Integer> numbers = new ArrayDeque<>();
    }

public static Stack<Integer> queueWithTwoStack(Stack<Integer> array) {
    Stack<Integer> numbers2 = new Stack<>();
    for (int i = 0; i<array.capacity(); i++){
        numbers2.push(array.pop());
    }
    return numbers2;
}


}
