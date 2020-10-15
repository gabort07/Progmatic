package com.company;


public class Main {

    public static void main(String[] args) {
    /*    int j = 4;
        int i = 10;
        i += j * 2 == i ? System.out.println(i) : System.out.println(i % 3);
   */
        int x = 10;
        int y = 2;
    /*    x = x + 1;
        int num = x * y +x;
        int sum = num - 2;
        System.out.println(sum);*/
        //System.out.println(++x+x*y-2);

    /*    int x1 = x+1;
        int mul = x1 * y;
        int sum = x + mul  - 2;
        System.out.println(sum); */

        //System.out.println(x++ + x*y -2);

        //   System.out.println(x++ + x * ++y - 2 / y--);

        ++y;
        int mul = (x + 1) * y;
        int div = 2 / y;
        int sum = x + mul - div;
        y--;
        x++;
        System.out.println(sum);


    }
}
