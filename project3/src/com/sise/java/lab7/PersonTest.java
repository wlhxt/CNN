package com.sise.java.lab7;

public class PersonTest {
    public static void main(String[] args) {
        System.out.println("以下是实例化对象方式调用不同方法输出的结果。");
        Person person=new Person();
        person.eat();
        person.run();
        person.swim();
        System.out.println("\n");
        System.out.println("以下是使用接口变量、抽象类引用调用方法的结果：");
        Runner runner=new Person();
        runner.run();
        Swimmer swimmer=new Person();
        swimmer.swim();
        Animal animal=new Person();
        animal.eat();
    }
}
