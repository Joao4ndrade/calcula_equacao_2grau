package com.company;

public class calcularaiz {
    public calcularaiz(double a, double b, double c) {
        double delta = Math.pow(b,2) - (4 * a * c);
        System.out.println("delta é:" + delta);
        if (delta < 0) {
            System.out.println("impossível continuar");
        } else if (delta >= 0){
            double x1 = (-b + Math.pow(delta, 0.5)) / 2* a;
            System.out.println("x1 é:" + x1);
            double x2 = (-b - Math.sqrt(delta))/2*a;
            System.out.println("x2 é:" + x2);
        }
        }
    }




