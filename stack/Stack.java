package stack;

public class Stack {
    int[] stack = new int[5];
    int top = 0;
    
    public void push(int data){
        if(top == 5){
            System.out.println("Stack is full");
        }else{
            stack[top] = data;
            top++;
        }
    }
    public int pop(){
        top--;
        int data = stack[top];
        stack[top] = 0;
        return data;
    }
    
    public void show(){
        for (int i = 0; i < stack.length; i++) {
            System.out.println(stack[i]);            
        }
    }
    public int size(){
        return top;
    }
    public boolean isEmpty(){
        if(top <= 0){
            return true;
        }
        return false;
    }
}
