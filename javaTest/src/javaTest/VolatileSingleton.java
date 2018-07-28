package javaTest;

public class VolatileSingleton {

    private static volatile VolatileSingleton vsingleton;

    private VolatileSingleton() {

    }

    public static VolatileSingleton getInstance() {
        if (vsingleton == null) {
            synchronized(VolatileSingleton.class) {
                //防止指令重排
                if (vsingleton == null) {
                    vsingleton = new VolatileSingleton();
                }
            }
        }

        return vsingleton;
    }
}