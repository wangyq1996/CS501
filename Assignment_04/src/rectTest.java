import java.util.Scanner;

public class rectTest{
    private class Rectangle {
        private double width = 1;
        private double height = 1;

        private Rectangle() {
        }

        private Rectangle(double w, double h) throws Exception {
            if (w < 0 || h < 0) throw new Exception();
            this.width = w;
            this.height = h;
        }

        private double getArea() {
            return width * height;
        }

        private double getPerimeter() {
            return (width + height) * 2;
        }
    }

    public static void main(String[]args){
        rectTest test = new rectTest();
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
                    r = test.new Rectangle(w,h);
                    break;
                }catch (Exception e){
                    System.out.println("Invalid input, please re-enter");
                }
            }
            System.out.println("The area of Rectangle is "+r.getArea()+" cm^2");
            System.out.println("The perimeter of Rectangle is "+r.getPerimeter()+" cm");
        }
        System.out.println("Program Closed");
    }
}
