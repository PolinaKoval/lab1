package com.company;

/**
 * Created by Polina on 16.03.2017.
 */
public class Gauss {
    double[] X = {
        0.033765,
        0.169395,
        0.380690,
        0.619310,
        0.830605,
        0.966235
    };
    double[] A = {
        0.085662,
        0.085662,
        0.180381,
        0.2333957,
        0.2333957,
        0.180381,
    };

    private double fnc(double x) {
        return 1/(1 + Math.pow(x, 2));
    }

    public double getValue() {
        double sum = 0;
        for (int i =  0; i < this.X.length; i++) {
            sum += this.A[i]*this.fnc(X[i]);
        }
        return sum;
    }
}
