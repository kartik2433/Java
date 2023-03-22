import java.util.Scanner;
import java.util.Arrays;
import java.lang.Integer;
class Pra_18{
    public static void main(String[] args){
        int size = Integer.parseInt(args[0]);
        int[] num = new int[size];
        for(int i=0; i<size; i++){
            num[i] = Integer.parseInt(args[i+1]);
        }
        Arrays.sort(num);
        System.out.print("Sorted Array: ");
        for(int i=0; i<size; i++){
            System.out.print(num[i]+" ");
        }
    }
}

/*  
Command: java Pra_18 3 25 75 48

Output:
Sorted Array: 25 48 75
*/