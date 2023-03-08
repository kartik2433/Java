import java.util.Scanner;
class Pra_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Program To Convert Meters Into Feets: ");
        System.out.print("Enter Meters: ");
        float meters = sc.nextFloat();
        float feets = meters * 3.28084f;
        System.out.println("Feets =  "+ feets);
    }
}