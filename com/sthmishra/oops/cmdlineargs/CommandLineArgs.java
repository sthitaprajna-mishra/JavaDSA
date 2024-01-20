package com.sthmishra.oops.cmdlineargs;

public class CommandLineArgs {
    public static void main(String[] args) {
        int argsLength = args.length;
        if(argsLength == 0) System.out.println("No args provided");
        else {
            System.out.println("List of args - ");
            for(String el : args) {
                System.out.println(el);
            }
        }
    }
}
