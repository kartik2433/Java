import java.util.Scanner;

public class Pra_22 {
    String name;
    int enroll;
    int marks;
    Pra_22() {
        this.name = "Jainam";
        this.enroll = 2101201075;
        this.marks = 488;
    }

    Pra_22(String name, int enroll, int marks) {
        this.name = name;
        this.enroll = enroll;
        this.marks = marks;
    }

    public void display() {
        System.out.println(name);
        System.out.println(enroll);
        System.out.println(marks);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Object Values :- ");
        System.out.print("Enter Name of Student : ");
        String name = sc.nextLine();
        System.out.print("Enter Enrollment No. : ");
        int enroll = sc.nextInt();
        System.out.print("Enter Total Marks : ");
        int marks = sc.nextInt();

        Pra_22 p1 = new Pra_22();
        Pra_22 p2 = new Pra_22(name, enroll, marks);

        System.out.println("Default Object Values :- ");
        p1.display();

        System.out.println("User Given Object Values :- ");
        p2.display();

    }
}

/*
Enter Object Values :- 
Enter Name of Student : Student 
Enter Enrollment No. : 2101201000
Enter Total Marks : 86
Default Object Values :-
Jainam
2101201075
488
User Given Object Values :-
Student
2101201000
86
*/