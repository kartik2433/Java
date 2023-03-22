import java.util.Scanner;

public class Pra_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer : ");
        int a = sc.nextInt();
        int b = a;
        int div = 2;
        System.out.print("Factors: ");
        while (a > 1) {
            if (a % div == 0) {
                System.out.print(div + ", ");
                a = a / div;
            }
            else {
                div++;
            }
        }
        System.out.println("\b\b.");
    }
}

/* Output: 

Enter an Integer : 540
Factors: 2, 2, 3, 3, 3, 5.

*/

