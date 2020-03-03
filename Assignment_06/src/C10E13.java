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
        if(Math.abs(x-this.x)<this.width/2 && Math.abs(y-this.y)<this.height/2) return true;
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
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Want to start program? (Y to start, other to exit)");
        String start = input.next();
        if(start.equals("Y")){
            outloop:
            while(true){
                MyRectangle2D rect = null;
                System.out.println("Type \"default\" for a default rectangle, Type \"set\" to set a new rectangle, Type \"e\" to exit");
                String type = input.next();
                if(type.equals("default") || type.equals("set")){
                    if(type.equals("default"))rect = new MyRectangle2D();
                    else if(type.equals("set")){
                        System.out.println("input new x value");
                        double x = input.nextDouble();
                        System.out.println("input new y value");
                        double y = input.nextDouble();
                        System.out.println("input new width value");
                        double w = input.nextDouble();
                        System.out.println("input new height value");
                        double h = input.nextDouble();
                        try{
                            rect = new MyRectangle2D(x,y,w,h);
                        }catch (Exception e){
                            System.out.println("Invalid input, program closed");
                            break outloop;
                        }
                    }
                    innerloop:
                    while(true){
                        System.out.println("Type \"get(X/Y/Width/Height)\" to print value, Type \"set(X/Y/Width/Height)\" to set value, Type \"con\" to continue");
                        String gsc = input.next();
                        if(gsc.equals("getX")) System.out.println(rect.getX());
                        else if(gsc.equals("getY")) System.out.println(rect.getY());
                        else if(gsc.equals("getWidth")) System.out.println(rect.getWidth());
                        else if(gsc.equals("getHeight")) System.out.println(rect.getHeight());
                        else if(gsc.equals("setX") || gsc.equals("setY") || gsc.equals("setWidth") || gsc.equals("setHeight")){
                            System.out.println("Input the value you want to set");
                            double temp = input.nextDouble();
                            if(gsc.equals("setX")) rect.setX(temp);
                            else if(gsc.equals("setY")) rect.setY(temp);
                            else if(gsc.equals("setWidth")){
                                try{
                                    rect.setWidth(temp);
                                }catch(Exception e){
                                    System.out.println("Invalid input");
                                }
                            } else{
                                try{
                                    rect.setHeight(temp);
                                }catch(Exception e){
                                    System.out.println("Invalid input");
                                }
                            }
                        }
                        else if(gsc.equals("con")) break innerloop;
                        else System.out.println("Invalid input");
                    }
                    System.out.println("");
                }
                else if(type.equals("e")) break;
                else System.out.println("Invalid input");
            }
        }
        System.out.println("Program closed.");
    }
}
