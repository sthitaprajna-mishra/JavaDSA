package com.sthmishra.reflection.john;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws IllegalAccessException {
        Cat myCat = new Cat("Stella", 6);

        Field[] catFields = myCat.getClass().getDeclaredFields();
        for(Field field : catFields) {
            System.out.println(field.getName());
        }

        for(Field field: catFields) {
            if(field.getName().equals("name")) {
                field.setAccessible(true);
                field.set(myCat, "Jimmy McGill");
            }
        }

        System.out.println(myCat.getName());
        System.out.println("----------------------------------------------");

        Method[] catMethods = myCat.getClass().getDeclaredMethods();
        for(Method method : catMethods) {
            System.out.println(method.getName());
        }

    }
}
