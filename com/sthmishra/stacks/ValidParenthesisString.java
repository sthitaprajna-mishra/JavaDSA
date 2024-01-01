package com.sthmishra.stacks;

import java.util.*;

//678. Valid Parenthesis String
public class ValidParenthesisString {

//    public boolean checkValidString(String s) {
//        Stack<Character> firstStack = new Stack<>();
//        Stack<Character> secondStack = new Stack<>();
//        int stars = 0;
//
//        if(s.charAt(0) != '*') {
//            firstStack.push(s.charAt(0));
//            secondStack.push(s.charAt(0));
//        }
//        for(int i = 1; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            if(!firstStack.isEmpty() && firstStack.peek() == '(' && ch == ')') {
//                firstStack.pop();
//                secondStack.pop();
//                continue;
//            }
//            else if(ch != '*') {
//                firstStack.push(ch);
//            }
//            secondStack.push(ch);
//            if(ch == '*') stars++;
//        }
//
//        if(firstStack.isEmpty()) return true;
//
//        if(secondStack.size()-stars != stars) return false;
//
//        Stack<Character> thirdStack = secondStack;
//        Stack<Character> reversedStack = new Stack<>();
//
//        while(!secondStack.isEmpty()) {
//            reversedStack.push(secondStack.pop());
//        }
//
//        while(!thirdStack.isEmpty()) {
//            char ch1 = thirdStack.pop();
//            char ch2 = reversedStack.pop();
//            if(ch1 == '*' && ch2 != '*') continue;
//            else return false;
//        }
//
//        return true;
//    }

    public static boolean isValid(String s) {
        Stack<Integer> leftParentheses = new Stack<>();
        Stack<Integer> stars = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                leftParentheses.push(i);
            } else if (c == '*') {
                stars.push(i);
            } else {
                // If there is a matching left parenthesis, pop it
                if (!leftParentheses.isEmpty()) {
                    leftParentheses.pop();
                } else if (!stars.isEmpty()) {
                    // If there is a star available, treat it as a matching left parenthesis
                    stars.pop();
                } else {
                    // If no left parenthesis or star is available, the string is invalid
                    return false;
                }
            }
        }

        // Now, we have some unmatched left parentheses and stars
        while (!leftParentheses.isEmpty()) {
            // If a star is available after the unmatched left parenthesis, treat it as a matching parenthesis
            if (stars.isEmpty() || leftParentheses.pop() > stars.pop()) {
                return false;
            }
        }

        return true;
    }
}
