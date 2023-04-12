import java.lang.*;
import java.util.Scanner;
class Person{
    String name;
    int age;
    int salary;

    void set_data(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        this.name = sc.next();
        System.out.print("Enter Age: ");
        this.age = sc.nextInt();
        System.out.print("Enter Salary: ");
        this.salary = sc.nextInt();
        System.out.println("--------------------------");
    }

    void get_data(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Salary: "+this.salary);
         System.out.println("--------------------------");
    }
}

class Pra_21{
    public static void main(String[] args){
        Person pr = new Person();
        pr.set_data();
        pr.get_data();
    }
}