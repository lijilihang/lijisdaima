package zhengze;

public class SplitrRepeat {

    public static void main(String[] args) {

        String str = "sdqqfgkkkhjppppkl";
        String[] arr = str.split("(.)\\1+");

        for(String s : arr) {
            System.out.println(s);
        }
    }
}