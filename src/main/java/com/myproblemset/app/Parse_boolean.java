package com.myproblemset.app;
import java.util.*;

public class Parse_boolean {
    public boolean Solution(String expression) {
        Stack<Character> stack = new Stack<>();
        for(char c: expression.toCharArray()) {
            if(c == '(' || c == ',') {
                continue;
            } 
            if(c == ')') {
                boolean True = false, False = false;
                while(stack.peek() == 't' || stack.peek() == 'f') {
                    if(stack.pop() == 't') {
                        True = true;
                    } else {
                        False = true;
                    }
                }
                char operator = stack.pop(), result;
                if(operator == '&') {
                    result = False ? 'f' : 't';
                } else if(operator == '|') {
                    result = True ? 't' : 'f';
                } else {
                    result = True ? 'f' : 't';
                }
                stack.push(result);
                continue;
            }
            stack.push(c);
        }
        return stack.pop() == 't' ? true : false;
    }
}
    

