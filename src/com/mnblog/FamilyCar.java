package com.mnblog;

/**
 * Created by Milan.Nikic on 10/6/2016.
 */
public class FamilyCar extends CarDecorator {

    public FamilyCar(Car car) {
        super(car);
    }

    @Override
    public void make(){
        super.make();
        System.out.println("Features of Family Car added");
    }
}
