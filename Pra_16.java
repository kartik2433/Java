import java.util.Scanner;

public class Pra_16 {
    public static void reverse(int[] arr) {
        int i = 0, temp;
        while (i <= arr.length / 2) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
            i++;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 Digits: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = input.nextInt();
        }
        reverse(arr);
        System.out.println("After reversing numbers in an Array :");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}

/* Output:

Enter 10 Digits: 
11
12
13
14
15
16
17 
18
19
20
After reversing numbers in an Array :
20  19  18  17  15  16  14  13  12  11 

*/