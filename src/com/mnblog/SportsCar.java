package com.mnblog;

/**
 * Created by Milan.Nikic on 10/6/2016.
 */
public class SportsCar extends CarDecorator {

    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void make() {
        super.make();
        System.out.println("Features of Sports Car added");
    }

}
