import java.util.*;
public class multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter any two integer values");
			int a=s.nextInt();
			int b=s.nextInt();
			int c=a/b;
			System.out.println(c);
			int num;
			System.out.println("Enter any integer");
			num = s.nextInt();
			System.out.println(num);
			String s1 = null;
			System.out.println(s1.charAt(2));
		}

		
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		catch(NullPointerException e) {
			System.out.println(e);
		}
		
		catch(InputMismatchException e){
			System.out.println(e);
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("This is finally block");
		}
	}

}
