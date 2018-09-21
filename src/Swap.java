import java.util.*;
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter three numbers to perform swapping");
		int temp;
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
	/*	temp = a;
		a = b;
		b = c;
		c = temp; */
		a = a + b + c;
		b = a - (b + c);
		c = a - (b + c);
		a = a - (b + c);
		System.out.println("The values after swapping are : ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
