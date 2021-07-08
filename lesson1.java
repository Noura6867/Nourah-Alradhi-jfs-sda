package Calculater;

import java.util.Scanner;

public class calculater {
public static void main(String[] args) {

	Scanner input=new Scanner(System.in);
	
	System.out.println("Enter The Frist Number");
	int n1=input.nextInt();
	
System.out.println("Enter The Operation");
	String op=input.next();
	
	System.out.println("Enter The second Number");
	int n2=input.nextInt();
	
	switch(op) {
	case "+":System.out.println("The Sum is"+(n1+n2)); break;
	case "-":System.out.println("The Sub is"+(n1-n2)) ;break;
	case "*":System.out.println("The Mult is"+(n1*n2)) ;break;
	case "/":System.out.println("The Div is"+(n1/n2)); break;
	default:System.out.println("Error Operation");
	}
}
}
