import java.util.Scanner;

public class IntersectingPoint{
    public double[] getLine(double x1,double y1,double x2,double y2) throws Exception {
        LinearEquation line = new LinearEquation(x1,1,x2,1,y1,y2);
        if(!line.isSolvable()) throw new Exception();
        double [] output = new double [2];
        output[0] = line.getX();
        output[1] = line.getY();
        return output;
    }

    public double[] getIntersectingPoint(double x1,double y1,double x2,double y2) throws Exception {
        LinearEquation line = new LinearEquation(x1,-1,x2,-1,-y1,-y2);
        if(!line.isSolvable()) throw new Exception();
        double [] output = new double [2];
        output[0] = line.getX();
        output[1] = line.getY();
        return output;
    }

    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Want to start the program?(Type Y or N)");
        String s = input.nextLine();
        if(s.equals("Y")){
            System.out.println("Please input 8 parameters which can be double");
            double []in = new double[8];
            for(int i=0;i<8;i++){
                System.out.println("Please input the "+(i+1)+"th number:");
                in[i] = input.nextDouble();
            }
            IntersectingPoint test = new IntersectingPoint();
            double[]line1 = new double[2];
            double[]line2 = new double[2];
            try{
                line1 = test.getLine(in[0],in[1],in[2],in[3]);
            }catch (Exception e){
                System.out.println("Line1 does not exist");
            }
            try{
                line2 = test.getLine(in[4],in[5],in[6],in[7]);
            }catch (Exception e){
                System.out.println("Line2 does not exist");
            }
            while(true){
                System.out.println("Type 1/2 to show Line1/2, Type out to show IntersectPoint, Type e to end program");
                String t = input.next();
                if(t.equals("1")) System.out.println("Line 1 is y="+line1[0]+"x + "+line1[1]);
                else if(t.equals("2")) System.out.println("Line 2 is y="+line2[0]+"x + "+line2[1]);
                else if(t.equals("out")){
                    try {
                        double []output = test.getIntersectingPoint(line1[0],line1[1],line2[0],line2[1]);
                        System.out.println("The intersect point is : ("+output[0]+","+output[1]+")");
                    }catch (Exception e){
                        System.out.println("There is no intersect point");
                    }
                }
                else if(t.equals("e")) break;
                else System.out.println("Invalid Input");
            }
        }
        System.out.println("Program Closed");
    }
}

