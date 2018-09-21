import java.util.InputMismatchException;
import java.util.Scanner;

public class Excep {
	
	static public void arithmetic() {
		System.out.println("Enter first integer input");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("Enter second integer input");
		int b = s.nextInt();
		try {
			int c = a / b;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
	}
	
	static public void input() {
		System.out.println("Enter any integer input");
		Scanner s = new Scanner(System.in);
		try {
		int x = s.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println(e);
		}
	}
	
	static public void array() {
		try {
		System.out.println("Enter the size of the array");
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++) {
			arr[i] = s.nextInt();
		}
		System.out.println("Enter the index of element you want to search");
		int find = s.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println(arr[find]);
		}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
	
	static public void number(){
		try {
			int num = Integer.parseInt("Hello");
			System.out.println(num);
		}
		catch(NumberFormatException e){
			System.out.println(e);
		}
	}
	
	static public void pointer() {
		try {
			String s = null;
			System.out.println(s.charAt(0));
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the exception you want to find");
		Scanner s = new Scanner(System.in);
		System.out.println("1.Arithmetic Exception \t 2.InputMismatch Exception \t 3.ArrayIndexOutOfBounds Exception \t 4.NumberFormat Exception \t 5.NullPointer Exception");
		int choice = s.nextInt();
		switch(choice) {
		case 1:
			arithmetic();
			break;
		case 2:
			input();
			break;
		case 3:
			array();
			break;
		case 4:
			number();
			break;
		case 5:
			pointer();
			break;
			default:
				System.out.println("You have entered a wrong choice");
				break;
		}
	}

}
