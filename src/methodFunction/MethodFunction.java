/*
	 * modifier returnType methodName(parameters){
	 * 		//statement
	 * 
	 * 		return value;
	 * }
	 */
package methodFunction;

import java.util.Scanner;

public class MethodFunction {
	//Global variable
	static int number = 2;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Local variable
		String greetings = "Hello, I'm emman";
//		int num = 0;
//		if (3 > 2) {
//			num=25;
//		}
//		System.out.println(greetings);
//		System.out.println(num);
		
		printNumber();
		System.out.println(isLegalAge(8));
		System.out.println(add(5,2));
		System.out.println(add(2,3,4));
	}
	
	//Method overloading
	static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	static double add(double num1, double num2) {
		return num1 + num2;
	}
	
	static int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	
	static void printHelloWorld() {
		
		System.out.println("Hello world");
//		System.out.println(greetings);
	}
	
	static void printNumber() {
		System.out.println(number);
	}
	
	static boolean isLegalAge(int age) {
		
		return (age>=18) ? true : false; //ternary operator
	}

}


