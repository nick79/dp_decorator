package com.mnblog;

/**
 * Created by Milan.Nikic on 10/6/2016.
 */
public class LuxuryCar extends CarDecorator {

    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void make() {
        super.make();
        System.out.println("Features of Luxury Car added");
    }
}
