public class Stack {
    Student[] studentArr;
    int capacity;
    int top;
    public Stack(int capacityf) {
        capacity = capacityf;
        studentArr = new Student[capacityf];
        top = -1;
    }
    public void push(Student element){
        if (isFull()){
             System.out.println("Your stack are overflow");
             
        } else {
         System.out.println("The element "+element+" is push to the stack");
         studentArr[++top] = element;
    }
    }
    public Student pop(){
        if(isEmpty()) {
            System.out.println("Stack underflow! No elements to pop.");
            return null; //-1 is error value
        }
        else {
            return studentArr[top--];
        }
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == capacity;
    }
    public Student peek(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        else {
            return studentArr[top];
        }
    }
    public int max(){
        return top;
    }
    
    
}


