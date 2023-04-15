package com.sise.java.lab7;

public class Bentley extends Car{
    @Override
    public String getBrand() {
        return "宾利牌汽车专用报警器";
    }

    @Override
    public void alarmNotic() {
        System.out.println("车主您好，有人在盗窃你的宾利车！");

    }

    @Override
    public String getInfo() {
        return "Bentley";
    }
}
