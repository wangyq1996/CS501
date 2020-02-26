import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C5C6 {
    private boolean [] isPrime(int num){
        boolean []ary = new boolean [num+1];
        for(int i = 2;i<ary.length;i++){
            if(ary[i]) continue;
            int k = 2;
            while(i*k<ary.length) ary[i*k++] = true;
        }
        return ary;
    }

    private List<Integer> C5E16(int num){
        List<Integer> output = new ArrayList<>();
        boolean []ary = isPrime(num);
        if(!ary[num]){
            output.add(num);
            return output;
        }
        int k = 2;
        while(k<=num){
            if(ary[k] || num % k != 0) k++;
            else{
                output.add(k);
                num /= k;
            }
        }
        return output;
    }

    private void C5E20(int num){
        boolean []ary = isPrime(num);
        int count = 1;
        for(int i = 2;i<ary.length;i++) {
            if(!ary[i]) {
                System.out.print(i + " ");
                count++;
                if(count%8 == 1) System.out.println();
            }
        }
    }

    private void C6E10(){
        C5E20(10000);
    }

    public static void main(String []args){
        C5C6 test = new C5C6();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num for C5E16: ");
        int num1 = input.nextInt();
        List<Integer> lst = test.C5E16(num1);
        for(int i:lst) System.out.print(i+" ");
        System.out.println("Enter num for C5E20: ");
        int num2 = input.nextInt();
        test.C5E20(num2);
        System.out.println("Output for C6E10: ");
        test.C6E10();
    }
}
