package javaTest;

import java.util.Scanner;

public class BackOrder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer(str);
        StringBuffer sbu = sb.reverse();
        System.out.println("位数是：" + str.length());
        System.out.println("逆序为：" + sbu.toString());
    }

}
