package com.company;

/**
 * Created by Polina on 15.03.2017.
 */
public class SimpsonMethod extends Method {

    public SimpsonMethod () {
        super(4);
    }

    @Override
    public double getValueWithStep(double h) throws Exception {
        double sum = 0;
        h = h/2;
        int n = (int)((this.stop - this.start) / h);
        for (int i = 1; i < n; i++){
            int coeff;
            if (i % 2 == 0) {
                coeff = 2;
            } else {
                coeff = 4;
            }
            sum += coeff * this.fnc(this.start + h*i);
        }
        return (h/3)*(this.fnc(this.start + h*0) + this.fnc(this.start + h*n) + sum);
    }

    @Override
    public String getName() {
        return "Метод Симпсона";
    }
}
