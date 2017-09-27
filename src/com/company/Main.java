package com.company;

public class Main {

    public static void main(String[] args) {
        sort(args);
        print(args);
    }
    
    public static void print(String[] args) {
        for (int i = 0; i < args.length; i++)
            System.out.println(args[i]);
    }
    
    public static void sort(String[] args) {
        for (int i = 0; i < args.length-1; i++)
            for (int j = i+1; j < args.length; j++)
                if (args[i].compareTo(args[j]) >= 0) {
                    String temp = args[i];
                    args[i] = args[j];
                    args[j] = temp;
                }
    }
}
