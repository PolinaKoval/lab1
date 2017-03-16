package com.company;

import java.util.concurrent.Callable;

/**
 * Created by Polina on 15.03.2017.
 */

public class MethodAverageRectangles extends Method {

    public MethodAverageRectangles() {
        super(2);
    }

    @Override
    public double getValueWithStep(double h) throws Exception {
        double start = this.start;
        double sum = 0;
        while (start <= this.stop) {
            sum += this.fnc((start + start + h)/2);
            start += h;
        }
        return h*sum;
    }

    @Override
    public String getName() {
        return "Метод средних прямоугольников";
    }
}