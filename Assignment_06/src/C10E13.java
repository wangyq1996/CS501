import java.util.Scanner;

class MyRectangle2D{
    private double x;
    private double y;
    private double width;
    private double height;

    public MyRectangle2D(){
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.height = 1;
    }

    public MyRectangle2D(double x,double y, double w,double h) throws Exception {
        if(w<0 || h<0) throw new Exception();
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
    }

    public void setX(double x){this.x = x;}

    public void setY(double y){this.y = y;}

    public void setWidth(double w) throws Exception {
        if(w<0) throw new Exception();
        this.width = w;
    }

    public void setHeight(double h) throws Exception {
        if(h<0) throw new Exception();
        this.height = h;
    }

    public double getX(){return this.x;}

    public double getY(){return this.y;}

    public double getWidth(){return this.width;}

    public double getHeight(){return this.height;}

    public double getArea(){return this.height*this.width;}

    public double getPerimeter(){return 2*(this.width+this.height);}

    public boolean contains(double x,double y){
        if(Math.abs(x-this.x)<=this.width/2 && Math.abs(y-this.y)<=this.height/2) return true;
        return false;
    }

    public boolean contains(MyRectangle2D r){
        double downX = r.x-r.width/2;
        double downY = r.y-r.height/2;
        double topX = r.x+r.width/2;
        double topY = r.y+r.height/2;
        if(contains(downX,downY) && contains(topX,topY)) return true;
        return false;
    }

    public boolean overlaps(MyRectangle2D r){
        double downX = r.x-r.width/2;
        double downY = r.y-r.height/2;
        double topX = r.x+r.width/2;
        double topY = r.y+r.height/2;
        if(!contains(r) &&
                (contains(downX,downY) || contains(downX,topY)
                        || contains(topX,downY) || contains(topX,topY))
        ) return true;
        return false;
    }
}

public class C10E13 {
    public static void main(String []args) throws Exception {
        Scanner input = new Scanner(System.in);
        outerloop:
        while(true){
            System.out.println("Start program?(Y or N)");
            String s = input.next();
            if(s.equals("Y")){
                middleloop:
                while(true){
                    System.out.println("Please input base rectangle");
                    System.out.println("Input x of center point:");
                    double x = input.nextDouble();
                    System.out.println("Input x of center point:");
                    double y = input.nextDouble();
                    System.out.println("Input width value");
                    double w = input.nextDouble();
                    System.out.println("Input height value");
                    double h = input.nextDouble();
                    MyRectangle2D rect;
                    try{
                         rect = new MyRectangle2D(x,y,w,h);
                    }catch (Exception e){
                        System.out.println("Invalid input, please re-enter.");
                        break middleloop;
                    }
                    System.out.println("Start testing:");
                    innerloop:
                    while(true){
                        double []testPoint = {3,3};
                        MyRectangle2D testRect1 = new MyRectangle2D(2,2,5.5,4.9);
                        MyRectangle2D testRect2 = new MyRectangle2D(3,5,2.3,5.4);
                        if(rect.contains(testPoint[0],testPoint[1])) System.out.println("TestPoint is in base rectangle.");
                        else System.out.println("TestPoint is not in base rectangle.");
                        if(rect.contains(testRect1)) System.out.println("Base rectangle includes testRectangle 1.");
                        else if(rect.overlaps(testRect1)) System.out.println("Base rectangle overlaps testRectangle 1.");
                        else System.out.println("Base rectangle distinct testRectangle 1.");
                        if(rect.contains(testRect2)) System.out.println("Base rectangle includes testRectangle 2.");
                        else if(rect.overlaps(testRect2)) System.out.println("Base rectangle overlaps testRectangle 2.");
                        else System.out.println("Base rectangle distinct testRectangle 2.");
                        break middleloop;
                    }
                }
            }
            System.out.println("Want to end program?(Y or N)");
            s = input.next();
            if(s.equals("Y")) break outerloop;
        }
        System.out.println("Program closed.");
    }
}
