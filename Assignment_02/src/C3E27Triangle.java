import java.util.Scanner;

public class C3E27Triangle {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x & y");
        double x = input.nextDouble();
        double y = input.nextDouble();
        if(x>0 && y>0 && y+0.5*x <= 100 ) System.out.println("The point is in triangle");
        else System.out.println("The point is not in triangle");
    }
}
