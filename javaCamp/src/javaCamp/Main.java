package javaCamp;



public class Main {

	public static void main(String[] args) {
		Course course1=new Course();
		course1.courseId=1;
		course1.courseName="JAVA+REACT";
		course1.instructorName="ENGÝN DEMÝROÐ";
		course1.courseDetail="2 AYDA JAVA";
		
		Course course2=new Course();
		course2.courseId=2;
		course2.courseName="C#+ANGULAR";
		course2.instructorName="ENGÝN DEMÝROÐ";
		course2.courseDetail="2 AYDA C#";
		
		Course[] courses= {course1,course2};
		CourseManager courseManager=new CourseManager();
		courseManager.Add(course2);
		courseManager.GetAll(courses);
		System.out.println("------------------------------------------------------------");
		
		Instructor instructor1=new Instructor();
		instructor1.instructorId=1;
		instructor1.firstName="ENGÝN";
		instructor1.lastName="DEMÝROÐ";
		Instructor[] instructors= {instructor1};
		System.out.println("EÐÝTMEN:"+instructor1.firstName+" "+instructor1.lastName);
		
		Student student1=new Student();
		student1.studentId=1;
		student1.studentFirstName="NURHAYAT";
		student1.studentLastName="KETENCÝ";
		student1.studentDetail="junior developer";
		Student[] Students= {student1};
		
		System.out.println("ÖÐRENCÝ:"+student1.studentFirstName+" "+student1.studentLastName);
		
	   
		
		



	}

}
