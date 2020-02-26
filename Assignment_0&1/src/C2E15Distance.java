import java.util.Scanner;

public class C2E15Distance {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input x1 & y1");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("Input x2 & y2");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.println("The Distance is :");
        System.out.println(Math.pow(Math.pow(x2-x1,2)+Math.pow(y2-y1,2),0.5));
    }
}
