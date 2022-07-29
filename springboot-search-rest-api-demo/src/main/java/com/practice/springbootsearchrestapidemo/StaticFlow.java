package com.practice.springbootsearchrestapidemo;

public class StaticFlow {
	static int i = 10;    //1 //7
    static {     //2
        m1(); //8
        System.out.println("first static block");
    }

    public static void main(String[] args) {  //3
        m1(); 
        System.out.println("main"); 
    }

    public static void m1() {  //4
        System.out.println(j);   //9
    }

    static { //5
        System.out.println("2nd block");  
    }
    static int j = 20;  //6
}

// 1. identification of static members 
//from top to bottom[1-6]
//2. Execution of static variable assignments 
//and static blocks from top to bottom
//3. main method execution
//output:
