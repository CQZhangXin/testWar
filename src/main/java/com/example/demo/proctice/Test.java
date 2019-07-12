package com.example.demo.proctice;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Zhangxin
 * @title: Test
 * @projectName testWar
 * @description: TODO
 * @date 2019/7/12  13:59
 */
public class Test {

    public static void main(String[] args) {

        //1、Java反射之动态执行方法
//        try {
//        Animal animal = new Dog();
//        animal.say();
//        Class<? extends Animal> animalClass = animal.getClass();
//        Method m = animalClass.getMethod("say");
//            m.invoke(animal);
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        }


        //2、通过反射的方式创建实例
//        Animal animal = new Dog();
//        Class<? extends Animal> animalClass = animal.getClass();
//        System.out.println("animal:"+animalClass);

//        try {
//            Animal animal1 = animalClass.newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }


//        try {
//            Constructor<? extends Animal> constructor = animalClass.getConstructor();
//            Animal animal1 = constructor.newInstance();
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }
//        Animal animal = new Cat();
//        animal.say();
//        Class<? extends Animal> animalClass = animal.getClass();
//
//        try {
////            Constructor<? extends Animal> constructor = animalClass.getConstructor(String.class);
////            Animal animal1 = constructor.newInstance("java菜鸟");
////            animal1.say();
//            Class animalClass = Cat.class;
//            Constructor[] constructors = animalClass.getConstructors();
//            Constructor constructor = animalClass.getConstructor();
//            Object o = constructor.newInstance();
//            ((Animal)o).say();
//        } catch (Exception e) {
//
//        }


    }
}
