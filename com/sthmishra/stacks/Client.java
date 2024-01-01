package com.sthmishra.stacks;

public class Client {
    public static void main(String[] args) {
//        String s = "((((()(()()()*()(((((*)()*(**(())))))(())()())(((())())())))))))(((((())*)))()))(()((*()*(*)))(*)()";
//        System.out.println(v.checkValidString(s));
//        System.out.println(ValidParenthesisString.isValid(s));
//        System.out.println((int)'(');
//        System.out.println((int)')');
//        System.out.println((int)'*');

//        String str = "()", locked = "11";
//        System.out.println(CheckParentheses.canBeValid(str, locked));

        StackService s = new StackService();
        int[] arr = new int[] {34, 35, 27, 42, 5, 28, 39, 20, 28};
        int[] ans = s.nearestSmallerElement(arr);
        for(int el : ans) System.out.print(el + " ");

    }
}
