
public class StatisticsStatic {
	
	static int minAvg;		//can be called without THIS
							//modified by calling i.e. StatisticsStatic.minAvg = 6
							//the value is assigned to the class, not to the instanced object
	
	static int average(Student[] students) { //THIS not used -> static method candidate
		float tot = 0;						 //As static THIS is not passed
		for(Student s: students) {			 //Can be called without creating object statistics
			tot += s.average();
		}
		return Math.round(tot / students.length);
	}
	
	static int averagePolitic(Student[] students) { 
		float tot = 0;						 
		for(Student s: students) {			 
			tot += s.average();
		}
		int avg = Math.round(tot / students.length);
		
		return Math.max(avg, StatisticsStatic.minAvg);//StatisticsStatic not mandatory
	}
	
}
