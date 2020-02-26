
public class Rectangle {
    private double width = 1;
    private double height = 1;

    public Rectangle(){}

    public Rectangle(double w,double h){
        try{
            if(w<0 || h<0) throw new Exception();
            this.width = w;
            this.height = h;
        }catch (Exception e) {
            System.out.println("Invalid Input");
        }
    }

    public double getArea(){
        return width*height;
    }

    public double getPerimeter(){
        return (width+height)*2;
    }

    public static void main(String[]args){
        Rectangle r = new Rectangle();
        r = new Rectangle(-1,1);
        System.out.println(r.getArea());
    }
}
