package javaTest;

public class Test1 {

    public static void main(String[] args) {
        String s = "2018-06-14 19:17:40";
        String str = s.replaceAll("[^0-9]", "");
        String h = "";
        for (int i = 0; i < 3; h+="x") {
            System.out.println(h);
        }
    }

}
