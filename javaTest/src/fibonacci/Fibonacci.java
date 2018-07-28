package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static int k;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long param = sc.nextLong();
        System.out.println("result = " + fibonacci(param));
        System.out.println("循环了" + k + "次");
    }

    public static long fibonacci(long param) {

        if (param == 1 || param == 0) {
            k++;
            return param;
        } else {
            return fibonacci(param - 1) + fibonacci(param - 2);
        }
    }
}