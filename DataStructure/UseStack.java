package DataStructure;

import java.util.List;
import java.util.Stack;

public class UseStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("New York");
        stack.push("Buffalo");
        stack.push("Boston");
        stack.push("Florida");

        if (stack.peek().equalsIgnoreCase("New York")) ;
        {
//        System.out.println(stack.peek());
            System.out.println(stack.pop());
        }

    }

}

