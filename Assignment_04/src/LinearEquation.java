import java.util.Scanner;

public class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public LinearEquation(double a, double b, double c, double d, double e, double f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA(){
        return this.a;
    }

    public double getB(){
        return this.b;
    }

    public double getC(){
        return this.c;
    }

    public double getD(){
        return this.d;
    }

    public double getE(){
        return this.e;
    }

    public double getF(){
        return this.f;
    }

    public boolean isSolvable(){
        if(this.a*this.d - this.b*this.c == 0) return false;
        return true;
    }

    public double getX(){
        if(isSolvable()) return (e*d-b*f)/(a*d-b*c);
        return -1;
    }

    public double getY(){
        if(isSolvable()) return (a*f-e*c)/(a*d-b*c);
        return -1;
    }

    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Want to start the program?(Type Y or N)");
        String s = input.nextLine();
        if(s.equals("Y")){
            System.out.println("Please input 6 parameters which can be double");
            double []in = new double[6];
            for(int i=0;i<6;i++){
                System.out.println("Please input the "+(i+1)+"th number:");
                in[i] = input.nextDouble();
            }
            LinearEquation test = new LinearEquation(in[0],in[1],in[2],in[3],in[4],in[5]);
            System.out.println("The equation is:");
            System.out.println(test.getA()+"x + "+test.getB()+"y = "+test.getE());
            System.out.println(test.getC()+"x + "+test.getD()+"y = "+test.getF());
            System.out.println("Type \"y\" to start calculation, other to exit");
            String t = input.next();
            if(t.equals("y")){
                try{
                    if(!test.isSolvable()) throw new Exception();
                    System.out.println("The output is:");
                    System.out.println("x = "+test.getX());
                    System.out.println("y = "+test.getY());
                }catch (Exception e){
                    System.out.println("This equation is not solvable");
                }
            }
        }
        System.out.println("Program Closed");
    }
}
