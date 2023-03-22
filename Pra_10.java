import java.util.Scanner;

public class Pra_10 {
    public static void pattern(String s) {
        for (int i=0; i<s.length(); i++) {
            for(int j=s.length()-i; j>0; j--){
                System.out.print(" ");
            }
            for(int j=0; j<i+1; j++){
                System.out.print(s.charAt(j) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = sc.nextLine();
        pattern(s);
    }
}

/* Output: 

Enter a String : Stream
      S     
     S t    
    S t r   
   S t r e  
  S t r e a 
 S t r e a m

*/
