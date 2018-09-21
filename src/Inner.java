class Outer1
{
	void print() {
		System.out.println("This is Outer class");
	}
	class Outer2 
	{
		void show() {
			System.out.println("This is first inner class");
		}
		public class Inner {
			void display( ){
				System.out.println("This is second inner class");
			}
		}

		}
	
	public static void main(String[] args) {
		Outer1 o1 = new Outer1();
		Outer1.Outer2 o = new Outer1().new Outer2();
		Outer1.Outer2.Inner i = new Outer1().new Outer2().new Inner();
		o1.print();
		o.show();
		i.display();
	}
	}


