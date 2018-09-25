import java.util.*;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, c, d ,x;
		char f = '*';
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number of rows");
		n = in.nextInt();

		for (c = 1; c <= n; c++) {
			for (d = n; d > c; d--) 
				System.out.print(" ");
			
			for(x = 1; x <= c; x++)
				System.out.print(f);
			
			System.out.println();

		}

	}

}
