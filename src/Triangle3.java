import java.util.Scanner;

public class Triangle3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r, i, k, j;
		char f = '*';
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Number of Rows : ");
		r = scan.nextInt();
		
		for(i=0;i<r;i++)
		{
			for(k=r; k>i; k--)
			{
				System.out.print(" ");
			} 
            
			for(j=0;j<=i;j++)
			{
				System.out.print(f + " ");
           
			}
			System.out.println();
		}
	}

}
