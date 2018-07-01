package javaTest;

public class Singleton {
    //方法一：饿汉式
    /*private static Singleton singleTon = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstence() {
        return singleTon;
    }*/

    //方法2：懒汉式
    /*private static Singleton singleton;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }*/

}
