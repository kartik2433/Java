import java.lang.*;
class Stack{
    int size;
    int[] stack;
    int top = -1;

    Stack(int size){
        this.size = size;
        stack = new int[size];
    }

    int pop(){
        if(top == -1){
            System.out.println("Stack Is Empty.");
            return -1;
        }
        else{
            int temp = stack[top];
            top--;
            System.out.println("Element Poped From Stack: " + temp );
            return temp;
        }
    }

    void push(int ele){
        if(top == size-1){
            System.out.println("Stack Is Full.");
        }
        else{
            top++;
            stack[top] = ele;
            System.out.println("Element Pushed In Stack: " + ele );
        }
    }

    void display(){
        for(int i=; i<this.top+1; i++){
            System.out.print(this.stack[i] + "  ");
        }
        System.out.println();
    }
}

class Pra_20{
    public static void main(String[] args){
        Stack s1 = new Stack(5);
        s1.push(25);
        s1.push(20);
        s1.push(15);
        s1.display();
        s1.pop();
        s1.display();
    }
}