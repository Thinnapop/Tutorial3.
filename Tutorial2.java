public class Tutorial2 {
    public static void main(String[] args) {
        Stack studentStack = new Stack(7);
        studentStack.push(new Student("Arthur", 672115019, 4.0)); 
        studentStack.push(new Student("Beatrice", 672115018, 3.0)); 
        studentStack.push(new Student("Charles", 672115017, 3.5)); 
        studentStack.push(new Student("Diana", 672115016, 3.4)); 
        studentStack.push(new Student("Ethan", 672115015, 3.3)); 
        studentStack.push(new Student("Fiona", 672115014, 3.2)); 
        studentStack.push(new Student("George", 672115013, 3.1)); 
        
        System.out.println("the top of element is  "+studentStack.peek());
        System.out.println("element has been poped "+studentStack.pop());
        System.out.println("element has been poped "+studentStack.pop());
        System.out.println("element has been poped "+studentStack.pop());

        System.out.println(studentStack.max());
    }
}