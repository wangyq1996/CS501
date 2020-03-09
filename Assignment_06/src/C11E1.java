import java.util.Scanner;

class Triangle{
    private double side1=1;
    private double side2=1;
    private double side3=1;

    Triangle(){}

    Triangle(double side1,double side2, double side3) throws IllegalTriangleException{
        if(side1<=0 || side2<=0 || side3<=0) throw new IllegalTriangleException("Illegal Input");
        if (side1 >= side2 + side3)
            throw new IllegalTriangleException("Side1 is larger than side2 + side3");
        else if (side2 >= side1 + side3)
            throw new IllegalTriangleException("Side2 is larger than side1 + side3");
        else if (side3 >= side2 + side1)
            throw new IllegalTriangleException("Side3 is larger than side1 + side2");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    double getSide1() {return this.side1;}

    double getSide2() {return this.side2;}

    double getSide3() {return this.side3;}

    double getPerimeter(){
        return this.side1+this.side2+this.side3;
    }

    double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * ((p - side1) * (p - side2) * (p - side3)));
    }

    public String toString(){
        return "Triangle side1 = " + this.getSide1() +
                "\nside2 = " + this.getSide2() +
                "\nside3 = "+ this.getSide3();
    }
}

public class C11E1 {

    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Start program?(Y or N)");
        String start = input.nextLine();
        if(start.equals("Y")){
            Triangle test;
            outerLoop:
            while (true){
                System.out.println("Type \"default\" to use default triangle, Type \"set\" to set a new triangle");
                String choose = input.next();
                if(choose.equals("default")) {
                    test = new Triangle();
                    break outerLoop;
                }else if(choose.equals(("set"))){
                    innerLoop:
                    while(true){
                        System.out.println("Type in side1:");
                        double side1 = input.nextDouble();
                        System.out.println("Type in side2:");
                        double side2 = input.nextDouble();
                        System.out.println("Type in side3:");
                        double side3 = input.nextDouble();
                        try{
                            test = new Triangle(side1,side2,side3);
                            break outerLoop;
                        }catch (IllegalTriangleException e){
                            System.out.println(e.getS());
                            System.out.println("Please re-enter.");
                        }
                    }

                }else System.out.println("Invalid input, please re-enter.");
            }
            System.out.println(test.toString() +
                    "\narea: " + test.getArea() +
                    "\nperimeter " + test.getPerimeter());
        }
        System.out.println("Program closed.");
    }
}
