import java.util.Scanner;
class Pra_2{
    public static void main(String[] args){
        float BMI;
        Scanner sc = new Scanner (System.in);
        System.out.println("Program To Find BMI Index.");
        float pound,inch;
        System.out.print("Enter Weight in Pounds :");
        pound = sc.nextFloat();
        System.out.print("Enter Height in Inches :");
        inch = sc.nextFloat();
        float kg,m;
        kg = pound * 0.45359237f;
        m = inch * 0.0254f;
        BMI = (kg/(m*m)); 
        System.out.println("BMI = "+BMI);
    }
}
