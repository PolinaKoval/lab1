package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        Method[] methods = {new MethodAverageRectangles(), new MethodTrapezes(), new SimpsonMethod()};
        double step1 = 0.1;
        double step2 = 0.05;
        System.out.println(Math.PI/4);
        for (int i = 0; i < 3; i++) {
            System.out.println(String.format(
                    "%30s: %.6f %.6f %.6f",
                    methods[i].getName(),
                    methods[i].getValueWithStep(step1),
                    methods[i].getValueWithStep(step2),
                    methods[i].getRungeError(step1)
            ));
        }
        System.out.println((new Gauss()).getValue());
    }
}


