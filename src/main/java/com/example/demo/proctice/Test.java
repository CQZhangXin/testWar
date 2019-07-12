package com.example.demo.proctice;

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
        try {
        Animal animal = new Dog();
        animal.say();
        Class<? extends Animal> animalClass = animal.getClass();
        Method m = animalClass.getMethod("say");
            m.invoke(animal);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }
}
