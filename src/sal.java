import java.util.*;

abstract class salary {
	abstract String show();
}

public class sal extends salary {
	Scanner s = new Scanner(System.in);

	String show() {
		double[] sal = new double[3];
		System.out.println("Enter the salaries of 3 employees");
		for(int i=0;i<sal.length;i++) {
			sal[i] = s.nextDouble();
		}
		double temp;  
		for (int i = 0; i < sal.length; i++)   
		        {  
		            for (int j = i + 1; j < sal.length; j++)   
		            {  
		                if (sal[i] > sal[j])   
		                {  
		                    temp = sal[i];  
		                    sal[i] = sal[j];  
		                    sal[j] = temp;  
		                }  
		            }  
		        }   
		String d = Double.toString(sal[sal.length-2]);
		return d;
		// System.out.println("The second largest salary is  : "+sal[sal.length-2]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		salary sa = new sal();
		sa.show();
	}

}
