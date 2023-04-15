package com.sise.java.lab7;

public class Customer {
    public static void main(String[] args) {
        System.out.println("顾客要购买宾利：");
        Car bentley=CarFactory.getCar("Bentley");
        System.out.println("提取汽车："+bentley.getInfo());
        System.out.println("赠送汽车报警器："+bentley.getBrand());
        Car bentley1=CarFactory.getCar("Bentley");
        System.out.println(CarFactory.BentleyCount);
        if(CarFactory.BentleyCount>1){
            bentley.alarmNotic();
        }
        System.out.println("\n");
        System.out.println("顾客要购买奥迪：");
        Car audi=CarFactory.getCar("Audi");
        System.out.println("提取汽车："+audi.getInfo());
        System.out.println("赠送汽车报警器："+audi.getBrand());
        Car audi1=CarFactory.getCar("Audi");
        System.out.println(CarFactory.AudiCount);
        if(CarFactory.AudiCount>1){
            audi.alarmNotic();
        }
    }
}
