
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(args[0]);
		boolean flag = false;
		for(int i=2;i<=num/2;i++){
			if(num%i==0){
				flag = true;
				break;
			}
		}
		if(!flag){
			System.out.println("It is a prime number");
		}
		else {
			System.out.println("It is not a prime number");
		}
	}

}
