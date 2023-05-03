package basic;

public class Calculations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10; double b = 1.87; String d = "Hi I am there "; boolean isTrue=false;
		System.out.println(d+""+"This is a string");
		double multiplicationOfTwoNumbers;
		System.out.println( multiplicationOfTwoNumbers = a * b);
		if (a> b ) {
			isTrue= true;
			System.out.println(" The value of a is greater than b");
		}
		
		else {
		System.out.println(" the value of b is greater than a");
		}
		if (isTrue== false)	{
			double temp= a +=b;
			System.out.println("The value of a+b is" + temp);
		} else {
			System.out.println("----blank----");
			
		}
		
		
		
	}

}
