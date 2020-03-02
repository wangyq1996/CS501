import java.util.Scanner;

public class Rectangle {
    private double width = 1;
    private double height = 1;

    private Rectangle(){}

    private Rectangle(double w, double h) throws Exception {
        if(w<0 || h<0) throw new Exception();
        this.width = w;
        this.height = h;
    }

    private double getArea(){
        return width*height;
    }

    private double getPerimeter(){
        return (width+height)*2;
    }

    public static void main(String[]args){
//        Rectangle r1 = new Rectangle(4,40);
//        System.out.println("Width of Rectangle 1 is :"+r1.width);
//        System.out.println("Height of Rectangle 1 is :"+r1.height);
//        System.out.println("Area of Rectangle 1 is :"+r1.getArea());
//        System.out.println("Perimeter of Rectangle 1 is :"+r1.getPerimeter());
//        Rectangle r2 = new Rectangle(3.5,35.9);
//        System.out.println("Width of Rectangle 2 is :"+r2.width);
//        System.out.println("Height of Rectangle 2 is :"+r2.height);
//        System.out.println("Area of Rectangle 2 is :"+r2.getArea());
//        System.out.println("Perimeter of Rectangle 2 is :"+r2.getPerimeter());
        Scanner input = new Scanner(System.in);
        System.out.println("Want to start the program?(Type Y or N)");
        String s = input.next();
        if(s.equals("Y")){
            Rectangle r;
            while(true){
                System.out.println("Input width(cm) of rectangle:");
                double w = input.nextDouble();
                System.out.println("Input height(cm) of rectangle:");
                double h = input.nextDouble();
                try{
                    r = new Rectangle(w,h);
                    break;
                }catch (Exception e){
                    System.out.println("Invalid input, please re-enter");
                }
            }
            while(true){
                System.out.println("Type a to get area, Type p to get perimeter, Type e to exit");
                String k = input.next();
                if(k.equals("a")) System.out.println("The area of Rectangle is "+r.getArea()+" cm^2");
                else if(k.equals("p")) System.out.println("The perimeter of Rectangle is "+r.getPerimeter()+" cm");
                else if(k.equals("e")) break;
                else System.out.println("Invalid Input");
            }
        }
        System.out.println("Program Closed");
    }
}
