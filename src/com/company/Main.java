package com.company;

public class Main {

    public static void main(String[] args) {
        print(args);
    }
    public static void print(String[] args){
        for (int i=0;i<args.length;i++)
            System.out.println(args[i]);
    }
}
