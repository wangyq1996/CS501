import java.util.Scanner;

public class C3E3LinerEquation {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a b c d e f :");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        if(a*d == b*c) System.out.println("The equation has no solution.");
        else System.out.println("x is "+((e*d-b*f)/(a*d-b*c))+" and y is "+((a*f-e*c)/(a*d-b*c)));
    }
}
