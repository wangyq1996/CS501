import java.util.Scanner;

public class C4E2Circle {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1 & y1");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("Enter x2 & y2");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.println("The distance between the two points is : " + 6371.01*Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2))));
    }
}
