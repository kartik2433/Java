import java.util.Scanner;
public class Pra_1{
    public static void main(String[] args){
        System.out.println("Solving Eq. Using Cramer's Rule: ");
        System.out.println("Eq's Format: aX + bY = e, cX + dY = f");
        Scanner sc = new Scanner(System.in);
        float a,b,c,d,e,f;
        System.out.print("Enter a: ");
        a=sc.nextFloat();
        System.out.print("Enter b: ");
        b=sc.nextFloat();
        System.out.print("Enter c: ");
        c=sc.nextFloat();
        System.out.print("Enter d: ");
        d=sc.nextFloat();
        System.out.print("Enter e: ");
        e=sc.nextFloat();
        System.out.print("Enter f: ");
        f=sc.nextFloat();
        if((a*d - b*c) == 0){
            System.out.println("The Equations Has No Solution...!!!");
        }
        else{
            float x,y;
            x=((e*d)-(b*f))/((a*d)-(b*c));
            y=((a*f)-(e*c))/((a*d)-(b*c));
            System.out.println("Solution: \n X = "+x+"\n Y = "+y);
        }
    }
}
