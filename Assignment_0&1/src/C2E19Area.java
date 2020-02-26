import java.util.Scanner;

public class C2E19Area {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input x1 & y1");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("Input x2 & y2");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.println("Input x3 & y3");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double s1 =Math.pow(Math.pow(x2-x1,2) + Math.pow(y2-y1,2),0.5);
        double s2 =Math.pow(Math.pow(x3-x2,2) + Math.pow(y3-y2,2),0.5);
        double s3 =Math.pow(Math.pow(x3-x1,2) + Math.pow(y3-y1,2),0.5);
        double s = (s1+s2+s3)/2;
        System.out.println("The area is :");
        System.out.println(Math.pow(s*(s-s1)*(s-s2)*(s-s3),0.5));
    }
}
