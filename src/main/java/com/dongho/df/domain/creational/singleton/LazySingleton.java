package com.dongho.df.domain.creational.singleton;

public class LazySingleton {

    public static boolean initialized = false;

    private LazySingleton() {

    }

    // use JVM load-time loading for lazy initialization.
    // see https://stackoverflow.com/questions/24538509/does-the-java-classloader-load-inner-classes
    private static class holder {
        public static LazySingleton instance;

        static {
            instance = new LazySingleton();
            LazySingleton.initialized = true;
        }
    }

    public static LazySingleton getInstance() {
        return holder.instance;
    }

}
