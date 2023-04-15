package com.sise.java.lab7;

public class Audi extends Car{
    @Override
    public String getBrand() {
        return "奥迪牌汽车专用报警器";
    }

    @Override
    public void alarmNotic() {
        System.out.println("车主您好，有人在盗窃你的奥迪车！");

    }

    @Override
    public String getInfo() {
        return "Audi";
    }
}
