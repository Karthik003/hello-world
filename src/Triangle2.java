import java.util.Scanner;

public class Triangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r, i, k, j;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Number of Rows : ");
		r = scan.nextInt();
		
		for(i=1;i<=r;i++)
		{
			for(k=1; k<i; k++)
			{
				System.out.print(" ");
			} 
            
			for(j=i;j<=r;j++) {
				System.out.print(" *");
			}
			
			System.out.println();
		}

	}

}
