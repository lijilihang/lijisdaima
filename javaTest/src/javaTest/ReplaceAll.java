package javaTest;

public class ReplaceAll {

    public static void main(String[] args) {
        String s = "2018-07-28 13:27:23";
        String q = s.replaceAll("[^0-9]", "");
        System.out.println(q);
    }
}