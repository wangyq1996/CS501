import java.util.Arrays;
import java.util.Scanner;

public class C7 {
    private double min(double []ary){
        Arrays.sort(ary);
        return ary[0];
    }

    private int minIndex(double []ary){
        double min = ary[0];
        int minIdex = 0;
        for(int i=1;i<ary.length;i++){
            if(ary[i]<min){
                min = ary[i];
                minIdex = i;
            }
        }
        return minIdex;
    }

    private void showSort(double []ary){
        Arrays.sort(ary);
        for(double d:ary) System.out.println(d);
    }

    public static void main(String []args){
        C7 test = new C7();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int num = input.nextInt();
        double []ary = new double [num];
        System.out.println("Enter element of array:");
        for(int i=0;i<ary.length;i++){
            double d = input.nextDouble();
            ary[i] = d;
        }
        System.out.println("Output of C7E9:");
        System.out.println(test.min(ary.clone()));
        System.out.println("Output of C7E10:");
        System.out.println(test.minIndex(ary));
        System.out.println("Output of C7E20:");
        test.showSort(ary);
    }
}
