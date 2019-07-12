package com.example.demo.proctice;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author Zhangxin
 * @title: Test2
 * @projectName testWar
 * @description: TODO
 * @date 2019/7/12  17:50
 */
public class Test2 {
    public static void main(String[] args) {

        //通过Java反射可以动态操作类的属性，但是只能操作有权限的属性
//        Class annimalClass = Cat.class;
//        try {
//            Field field = annimalClass.getDeclaredField("age");
//            Cat cat = new Cat();
//            field.set(cat,3);
//            cat.say();
//            field.set(cat,4);
//            cat.say();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        try {
//            Constructor constructor = annimalClass.getConstructor();
//            Animal animal = (Animal) constructor.newInstance();
//            animal.say();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        try {
            Class<?> annimalClass = Class.forName("com.example.demo.proctice.Cat");
//            Field field = annimalClass.getDeclaredField("age");
//            Cat cat = new Cat();
//            field.set(cat,5);
//            cat.say();
            Constructor<?> constructor = annimalClass.getConstructor();
            Cat cat = (Cat) constructor.newInstance();
            Method method = annimalClass.getMethod("act",String.class);
            method.invoke(cat,"10");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
