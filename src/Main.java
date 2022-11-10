import circleArea.Circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your radius");
        double radius= scanner.nextDouble();
        System.out.println(circle.areaByRadius());
        System.out.println("Please enter your circumference");
        double circumference=scanner.nextDouble();
        System.out.println(circle.areaByCircumference(circumference));
        System.out.println("Please enter your diameter");
        double diameter=scanner.nextDouble();
        System.out.println(circle.AreaByDiameter(diameter));
        System.out.println(circle.CircleAreaByDiameter(diameter));


    }
}