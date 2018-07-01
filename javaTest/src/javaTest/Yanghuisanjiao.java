package javaTest;

public class Yanghuisanjiao {
    public static void main(String[] args) {
        int [][] tangle = new int[10][10];
        for (int i = 0; i < 10; i++) {
            tangle[i][0] = 1;
            tangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                tangle[i][j] = tangle[i - 1][j - 1] + tangle[i - 1][j];
            }
        }

        for (int k = 0; k < 10; k++) {
            System.out.println();
            for (int m = 0; m < 10; m++) {
                System.out.print(tangle[k][m] + "   ");
            }
        }
    }

}
