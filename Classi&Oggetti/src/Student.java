
public class Student {
	//ATTRIBUTES
	String name;
	String surname;
	int[] marks;
	int age;
	
	//CONSTRUCTORS
	Student(String name, String surname){
		this.name = name;
		this.surname = surname;
	}
	
	Student(){};
	
	//METHODS
	int average(){
		float sum = 0;
		for(int i = 0; i < this.marks.length; i++){
			sum += this.marks[i];
		}
		float avg = sum / this.marks.length;
		return Math.round(avg);
	}
}
