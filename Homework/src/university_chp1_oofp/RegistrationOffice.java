package university_chp1_oofp;

import java.util.Date;
import java.util.Random;

public class RegistrationOffice {

	public RegistrationOffice() {
	
	}
	
	public Student getAStudent() {
		  Random random = new Random();
	        int rand = random.nextInt(5);
	        
	        int studentNumber = random.nextInt(100);
	        
	        if(rand == 0) {
	        	Student student = new GraduatedStudent(studentNumber, "ozge", 2020,new Date(2020,8,6), "Computer Science", "Albert Levi", "Carpooling");
	        	return student;
	        }else  if(rand == 1) {
	        	Student student = new MasterStudent(studentNumber, "ilayda", 2020,new Date(2019,8,6), "Economics", "Ozgur Demirtas", "MacroEconomi");
	        	return student;
	        }else  if(rand == 2) {
	        	Student student = new PHDStudent(studentNumber, "alper", 2020,new Date(2020,8,6), "Electronics", "Yucel", "Hybrid Cars", true);
	        	return student;
	        }else if(rand == 3) {
	        	Student student = new VocationalStudent(studentNumber, "baturalp", 2020,new Date(2015,8,6), "Pilot");
	        	return student;
	        }else{
	        	Student student = new UndergraduateStudent(studentNumber, "eylul", 2020,new Date(2019,8,6), "Psychology", "Maths");
	        	return student;
	        }
	}
	
	public void registerStudent(Student student) {
		
		if(student instanceof PHDStudent) {
			PHDStudent phdStudent = (PHDStudent) student;
			System.out.println(phdStudent.getName() + " has registered as PHDStudent at " + phdStudent.getYear());
		}
		else if(student instanceof MasterStudent) {
			MasterStudent masterStudent = (MasterStudent) student;
			System.out.println(masterStudent.getName() + " has registered as master student at " + masterStudent.getYear());
		}
		else if(student instanceof GraduatedStudent) {
			GraduatedStudent gradStudent =(GraduatedStudent) student;
			System.out.println(gradStudent.getName() + " has registered as graduated student at " + gradStudent.getYear());
		}
		else if(student instanceof UndergraduateStudent) {
			UndergraduateStudent undergradStudent =(UndergraduateStudent) student;
			System.out.println(undergradStudent.getName() + " has registered as undergraduate student student at " + undergradStudent.getYear());
		}
		else if(student instanceof VocationalStudent) {
			VocationalStudent vocationalStudent =(VocationalStudent) student;
			System.out.println(vocationalStudent.getName() + " has registered as vocational student at " + vocationalStudent.getYear());
		}
		else {
			System.out.println(student.getName() + " has registered as graduated student at " + student.getYear());
		}
	}

}
