package org.launchcode.java.studios.areaofaacircle;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Area {


    public static void main(String args[]) {
        double r;
        int i=0;
        double pi = 3.14, area;
        Scanner s = new Scanner(new InputStreamReader(System.in));
        System.out.print("Enter a radius :");
        r = s.nextDouble();
        if (r < 0) {
            System.out.println(+r + " is a negative number ");
        } else {
            //Circle.getArea();
            //area = pi * r* r;

            System.out.println("The area of a circle of radius " + r + " is: " + Circle.getArea(r));
        }

    }
}


