//Write a program to count the number of words that  start with capital letters 
import java.util.Scanner;
import java.lang.String;
class Pra_8{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Sentence: ");
        String Line = sc.nextLine();
        String[] words = Line.split(" ");
        int cap=0;
        for(int i=0; i<words.length; i++){
            int ascii = words[i].charAt(0);
            if(ascii >= 65 && ascii <= 90){
                cap++;
            }
        }
       System.out.println("Total Number Of Words Start With Capital Letter: "+ cap);
    }
}

/* Output: 

Enter Sentence: I am Very lazy Person.
Total Number Of Words Start With Capital Letter: 3

*/