package company.Stack_Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RadixOrder {
    public static void main(String[] args) {
        ArrayList<Queue<Integer>> container = new ArrayList<>(11);
        int[] numbers = {231, 333, 546, 768, 4356, 212, 344, 6783, 3452, 478, 9897, 6785, 554, 5630};
        for (int i = 0; i < 11; i++) {
            Queue<Integer> bucket = new LinkedList<>();
            container.add(bucket);
        }
        for (int i = 0; i < numbers.length; i++) {
            container.get(10).add(numbers[i]);
        }
        System.out.println(container);

//       while(!container.get(10).isEmpty()) {
//            int actual = container.get(10).poll();
//            int index = (actual % 10);
//            System.out.println(index);
//            container.get(index).add(actual);
//        }


//        Stack<Integer> fibo = new Stack<>();
//        fibo.push(5);
//        int nr1 = fibo.pop();
//        System.out.println(nr1);
//        fibo.push(nr1 - 1);
//        fibo.push(nr1 - 2);
//        nr1 = fibo.pop();
//        System.out.println(nr1);
//        fibo.push(nr1 - 1);
//        fibo.push(nr1 - 2);

        fibo(7 );
    }

    public static void fibo(int nr) {
        Stack<Integer> fibo = new Stack<>();
        fibo.push(nr);
        int sum = 0;
        while (!fibo.isEmpty()) {
            int n = fibo.pop();
            if (n == 1 || n == 0) {
                sum += n;
            } else {
                fibo.push(n - 1);
                fibo.push(n - 2);
            }
        }
        System.out.println(sum);
    }
}