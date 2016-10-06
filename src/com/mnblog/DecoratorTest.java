package com.mnblog;

/**
 * Created by Milan.Nikic on 10/6/2016.
 */
public class DecoratorTest {

    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.make();
        System.out.println();

        Car sportsFamilyCar = new FamilyCar(sportsCar);
        sportsFamilyCar.make();
        System.out.println();

        Car sportsFamilyLuxuryCar = new LuxuryCar(sportsFamilyCar);
        sportsFamilyLuxuryCar.make();
        System.out.println();
    }
}
