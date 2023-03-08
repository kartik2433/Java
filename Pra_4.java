import java.util.Scanner;
class Pra_4{
    public static void main(String[] args){
        System.out.println("Program To Check Prime Number: ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        boolean flag = true;
        for(int i=2; i<num; i++){
            if((num % i) == 0){
                flag = false;
                break;
            }
        }
        if(flag) {
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Non Prime Number");
        }
    }
}