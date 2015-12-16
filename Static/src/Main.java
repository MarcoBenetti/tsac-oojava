/*
 * Student - course management
 * 
 * GRADES -> NO DOUBLE/FLOAT, no scientific data 
 * 		  \_ fix point (2 digits) -> int + notation
 * 				(petrol -> 3 digits)
 */

public class Main {

	public static void main(String[] args) {
		Student karl = new Student();  //new creates on heap memory and links to stack variable luca
		
		karl.name = "Karl";
		karl.surname = "Marx";
		
		int age = 23;
		karl.age = age;
		
		karl.marks = new int[] {3,2,4,1};
		
		System.out.println("Karl marx = " + karl.marks[2]);
		System.out.println("Karl average");
	}
}
