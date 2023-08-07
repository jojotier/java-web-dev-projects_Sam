package org.launchcode;
import java.util.Scanner;
public class MilesPerGallonFinder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven? ");
        Integer miles = input.nextInt();
        System.out.println("How many gallons of gas did your car consume? ");
        Integer gas = input.nextInt();
        Integer mph = miles/gas;
        System.out.println("Your mph is "+mph+" miles per hour.");
    }
}
