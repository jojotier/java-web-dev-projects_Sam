package org.launchcode;
import java.util.Scanner;

public class RectangleAreaFinder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of your rectangle? ");
        Integer length = input.nextInt();
        System.out.println("What is the width of your rectangle? ");
        Integer width = input.nextInt();
        Integer area = length * width;
        System.out.println("The area is " + area + ".");
    }
}
