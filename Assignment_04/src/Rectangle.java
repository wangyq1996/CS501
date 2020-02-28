
public class Rectangle {
    private double width = 1;
    private double height = 1;

    private Rectangle(){}

    private Rectangle(double w, double h){
        try{
            if(w<0 || h<0) throw new Exception();
            this.width = w;
            this.height = h;
        }catch (Exception e) {
            System.out.println("Invalid Input");
        }
    }

    private double getArea(){
        return width*height;
    }

    private double getPerimeter(){
        return (width+height)*2;
    }

    public static void main(String[]args){
        Rectangle r1 = new Rectangle(4,40);
        System.out.println("Width of Rectangle 1 is :"+r1.width);
        System.out.println("Height of Rectangle 1 is :"+r1.height);
        System.out.println("Area of Rectangle 1 is :"+r1.getArea());
        System.out.println("Perimeter of Rectangle 1 is :"+r1.getPerimeter());
        Rectangle r2 = new Rectangle(3.5,35.9);
        System.out.println("Width of Rectangle 2 is :"+r2.width);
        System.out.println("Height of Rectangle 2 is :"+r2.height);
        System.out.println("Area of Rectangle 2 is :"+r2.getArea());
        System.out.println("Perimeter of Rectangle 2 is :"+r2.getPerimeter());
    }
}
