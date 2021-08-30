package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("insira o 'a' da equação");
        double a = in.nextDouble();
        System.out.println("insira o 'b' da equação");
        double b = in.nextDouble();
        System.out.println("insira o 'c' da equação");
        double c = in.nextDouble();
        new calcularaiz( a, b, c);


    }
}
