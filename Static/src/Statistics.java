
public class Statistics {
	
	int average(Student[] students) { //THIS not used -> static method candidate
		float tot = 0;						 //As static THIS is not passed
		for(Student s: students) {			 //Can be called without creating object statistics
			tot += s.average();
		}
		return Math.round(tot / students.length);
	}
}
