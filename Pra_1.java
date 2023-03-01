import java.lang.*;
import java.util.Scanner;
public class Pra_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a,b,c,d,e,f;
        System.out.println("Enter a,b,c,d,e & f Respectively: ");
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        d=sc.nextFloat();
        e=sc.nextFloat();
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