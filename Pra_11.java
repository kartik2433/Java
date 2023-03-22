import java.util.Random;

public class Pra_11 {
    public static void main(String[] args) {
        Random ra = new Random();
        System.out.println("Random Numbers: ");
        for(int i=0; i<100; i++) {
            System.out.println(ra.nextInt(49));
        }
    }
}

/* Output: 

Random Numbers:
39
9
31
15
45
...

*/