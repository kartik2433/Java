import java.util.Random;

public class Pra_12 {
    public static void main(String[] args) {
        Random ra = new Random();
        int num = ra.nextInt(9999);
        int n = 'Z' - 'A' + 1;
        char ch = 0;
        String alpha = "";
        for (int i = 0; i < 2; i++) {
            ch = (char) ('A' + Math.random() * n);
            alpha += ch;
        }
        alpha+=" ";
        System.out.println(alpha + num);
    }
}