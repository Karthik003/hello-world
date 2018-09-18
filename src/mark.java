import java.util.*;

interface ma {
	public String sam();
}

abstract public class mark implements ma {

	public String sam() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter marks of three subjects");
		double marks1 = s.nextDouble();
		double marks2 = s.nextDouble();
		double marks3 = s.nextDouble();

		double avg = (marks1 + marks2 + marks3) / 3;
		String d5 = Double.toString(avg);
		return d5;
		
	}

}

class marklist extends mark {
	public static void main(String[] args) {
		marklist ml = new marklist();
		ml.sam();
	}

}
