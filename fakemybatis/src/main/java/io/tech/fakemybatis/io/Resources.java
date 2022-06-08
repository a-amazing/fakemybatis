package io.tech.fakemybatis.io;

public class Resources {
    public static Class<?> classForName(String className) throws ClassNotFoundException{
        return Resources.class.getClassLoader().loadClass(className);
    }
}
