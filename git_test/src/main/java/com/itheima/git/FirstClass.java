package com.itheima.git;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("hello git");

        FirstClass a = new FirstClass();
        int sum = a.add(1, 2);
        System.out.println(sum);
    }

    public int add(int a,int b){
        return a+b;
    }
}
