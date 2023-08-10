package studios.areaofacircle;

import java.util.Scanner;

public class area {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
    System.out.println("Enter a radius: ");
    double radius = input.nextDouble();
    double area = circle.getArea(radius);
    System.out.println("The circle's radius is " + area + ".");

    }

}
