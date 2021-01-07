package org.launchcode.java.studios.areaofaacircle;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Area {


    public static void main(String args[]) {
        double radius;
        double pi = 3.14, area;
        //Scanner s = new Scanner(new InputStreamReader(System.in));
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a radius :");

        boolean flags = true;
        while(flags){
            radius = s.nextDouble();
            if (radius < 0) {
                System.out.println(+radius + " is a negative number ");
            } else {
                System.out.println("The area of a circle of radius " + radius + " is: " + Circle.getArea(radius));
                flags = false;
            }
        }

    }
}


