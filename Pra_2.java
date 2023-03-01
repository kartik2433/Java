import java.lang.*;
import java.util.Scanner;
class Pra_2{
    public static void main(String[] args){
        float BMI;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Weight in Pounds, Height In Inches: ");
        double pound,inch;
        pound = sc.nextInt();
        inch = sc.nextInt();
        double kg,m;
        kg = pound * 0.45359237;
        m = inch * 0.0254;
        BMI = (kg/(m*m)).floatValue; 
        System.out.println("BMI = "+BMI);
    }
}