import java.util.*;
public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Im a Java Developer";
		System.out.println(str);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the character for which you want to find occurrance");
		char c = s.next().charAt(0);
		int count = 0;
		for(int i=0;i<str.length();i++){
			if (str.charAt(i) == c ){
				count++;
			}
		}
		System.out.println("Number of occurrances are : "+count);
	}

}
