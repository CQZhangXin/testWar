package com.example.demo.proctice;

/**
 * @author Zhangxin
 * @title: Cat
 * @projectName testWar
 * @description: TODO
 * @date 2019/7/12  13:58
 */
public class Cat implements Animal {
    private String name ;
    protected int age =2;

    public Cat(String name){
        this.name = name;

    }

    public Cat(){
       name = "无名";
    }

    @Override
    public void say() {
        System.out.print("我是一只喵喵,我的名字是："+this.name);
        System.out.println("   今年我有"+this.age+"岁了！");
    }

    public void act(String a){
        System.out.println("我有"+a+"斤重！");
    }
}
