package com.sise.java.lab7;

public class Person extends Animal implements Runner,Swimmer{
    @Override
    public void eat() {
        System.out.println("我牙好胃好，吃啥都香！");
    }

    @Override
    public void run() {
        System.out.println("我是飞毛腿，跑步速度极快！");
    }

    @Override
    public void swim() {
        System.out.println("我游泳技术很好，会蛙泳、自由泳、仰泳、蝶泳。。。");
    }
}
