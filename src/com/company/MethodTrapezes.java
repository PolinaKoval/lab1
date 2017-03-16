package com.company;

/**
 * Created by Polina on 15.03.2017.
 */
public class MethodTrapezes extends Method {

    public MethodTrapezes() {
        super(2);
    }

    @Override
    public double getValueWithStep(double h) throws Exception {
        double sum = 0;
        int n = (int)((this.stop - this.start)/h);
        for (int i = 1; i < n; i++){
            sum += this.fnc(this.start + h*i);
        }
        return h*((this.fnc(this.start) + this.fnc(this.stop))/2 + sum);
    }

    @Override
    public String getName() {
        return "Метод трапеций";
    }
}
