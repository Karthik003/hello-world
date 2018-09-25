import java.util.Scanner;

public class Triangle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, c, d;
		char f = '*';
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number of rows");
		n = in.nextInt();

		for (c = 1; c <= n; c++) {
			for (d = 1; d <= c; d++) {
				System.out.print(f + " ");
			}

			System.out.println();
		}
	}

}
