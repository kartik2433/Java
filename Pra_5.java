import java.util.Scanner;
class Pra_5{
    public static void main(String[] args){
        System.out.println("Enter 3 Numbers :");
        Scanner sc = new Scanner (System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.print("Maximum Value: "+a);
            }
            else{
                System.out.print("Maximum Value: "+c);
            }
        } 
        else{
            if(b>c){
                System.out.print("Maximum Value: "+b);
            }
            else{
                System.out.print("Maximum Value: "+c);
            }
        }      
    }
}