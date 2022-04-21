package project;
import za.ac.wsu.s221760571.Circle;
/**
 * @author P MAJEZI 221760571
 */
public class CircleApp {
    public static void main(String[] args) {
        //Circle object one
        Circle circle1 = new Circle();
        circle1.setRadius((float) 3.2);
        circle1.setX(8);
        circle1.setY(4);
        System.out.println("Circle 1");
        System.out.println(circle1.toString());
        System.out.println("Area: " + circle1.calculateArea() + "\n Circumference: " + 
             circle1.calculateCircumference() + "\nDiameter: " + circle1.calculateDiameter()+ "\n");
        //Circle object two 
        Circle circle2 = new Circle();
        circle2.setRadius((float) 4.5);
        circle2.setX(6);
        circle2.setY(3);
        System.out.println("Circle 2");
        System.out.println(circle2.toString());
        System.out.println("Area : " + circle2.calculateArea() + "\n Circumference: " + 
             circle2.calculateCircumference() + "\nDiameter: " + circle2.calculateDiameter()+ "\n");
        //Circle object three
        Circle circle3 = new Circle();
        circle3.setRadius((float) -7.8);
        circle3.setX(14);
        circle3.setY(7);
        System.out.println("Circle 3");
        System.out.println(circle3.toString());
        System.out.println("Area : " + circle3.calculateArea() + "\n Circumference: " + 
             circle3.calculateCircumference() + "\nDiameter: " + circle3.calculateDiameter()+ "\n");
    }
}
