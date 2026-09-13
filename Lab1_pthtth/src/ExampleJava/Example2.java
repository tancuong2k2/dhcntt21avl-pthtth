package ExampleJava;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What's your name?");
		String str = scanner.nextLine();
		System.out.println("Hi, I am " + str);
	}
}
