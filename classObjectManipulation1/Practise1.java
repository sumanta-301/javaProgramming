
public class Practise1 {
	int x= 7;
	String hello = "I am first Class Object";
	final String a = "I am  final"; 
	void  concatination(String name) {
		System.out.println(hello+" "+ name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practise1 obj1 = new Practise1();
		obj1.x = 4; //changing variable value by creating object
		Practise1 obj2 = new Practise1();
		obj2.concatination("Sumanta"); // we need to create object to access non static method
		Practise1 obj3 = new Practise1();
		//obj3.a = "Trying to change final value"; // can't reassign or change a variable value declared with final keyword
		System.out.println(obj3.a);
	
		
	}

}
