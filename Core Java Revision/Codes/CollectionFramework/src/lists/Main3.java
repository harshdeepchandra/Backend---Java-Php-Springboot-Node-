package lists;

import java.util.List;
import java.util.Stack;

// Stack
public class Main3 {
    public static void main(String[] args) {

        // Wrong Initialization
        List<Integer> myWrongStack = new Stack<>();

//        myWrongStack.add(5);
//        myWrongStack.add(7);
//        myWrongStack.add(11);
//
//        myWrongStack.remove(1);
//
//        System.out.println(myWrongStack);

        Stack<Integer> myStack = new Stack<>();

        myStack.push(5);
        myStack.push(7);
        myStack.push(11);

        System.out.println(myStack.peek());

        myStack.pop();

        System.out.println(myStack.peek());

        myStack.pop();

        System.out.println(myStack.peek());

        myStack.pop();

//        System.out.println(myStack.peek());




    }
}
