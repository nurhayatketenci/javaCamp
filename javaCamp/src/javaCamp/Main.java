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
		courseManager.GetAll(courses);
		courseManager.Add(course2);
		courseManager.Delete(course2);


	}

}
