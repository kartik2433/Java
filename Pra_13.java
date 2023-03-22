import java.util.Scanner;

public class Pra_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal Number: ");
        String s = sc.next();
        int index = s.indexOf(".");
        System.out.println("Integer Part is " + s.substring(0,index));
        System.out.println("Fraction Part is 0" +s.substring(index));
    }
}

/* Output: 

Enter a Decimal Number: 24.33
Integer Part is 24
Fraction Part is 0.33

*/