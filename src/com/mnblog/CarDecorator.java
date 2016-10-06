package com.mnblog;

/**
 * Created by Milan.Nikic on 10/6/2016.
 */
public class CarDecorator implements Car {

    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void make() {
        car.make();
    }
}
