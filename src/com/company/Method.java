package com.company;

/**
 * Created by Polina on 15.03.2017.
 */
public abstract class Method {

    double start;
    double stop;
    int order;

    public Method(int order) {
        this.start = 0;
        this.stop = 1;
        this.order = order;
    }

    protected double fnc(double x) {
        return 1/(1 + Math.pow(x, 2));
    }

    abstract public double getValueWithStep(double h) throws Exception;

    public double getRungeError(double h) throws Exception {
        return (this.getValueWithStep(h/2) - this.getValueWithStep(h))/Math.pow(2, this.order -1);
    }

    abstract public String getName();
}
