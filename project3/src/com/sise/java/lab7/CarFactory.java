package com.sise.java.lab7;

public class CarFactory {
    public static int AudiCount=0;
    public static int BentleyCount=0;
    public static Car getCar(String carName){
        if(carName.equals("Bentley")){
            BentleyCount++;
            return new Bentley();
        }else if(carName.equals("Audi")){
            AudiCount++;
            return new Audi();
        }else{
            return null;
        }
    }
}
