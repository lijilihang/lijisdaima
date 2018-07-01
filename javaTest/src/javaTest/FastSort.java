package javaTest;

import java.util.Scanner;

public class FastSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String [] st = str.split(" ");
        int [] s = new int[st.length];
        for (int i = 0; i < s.length; i++) {
            s[i] = Integer.parseInt(st[i]);
        }


        for (int j = 0; j < s.length; j++) {

            for (int  k = 0; k < s.length - 1; k++) {
                if (s[k] > s[k + 1]) {
                    int temp = s[k];
                    s[k] = s[k + 1];
                    s[k + 1] = temp;
                    break;
                }
            }
        }

        for (int m = 0; m < s.length; m++) {
            System.out.println(s[m]);
        }

    }

}
