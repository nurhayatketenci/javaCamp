package javaCamp;

public class CourseManager {

		public void Add(Course course) {
			System.out.println(course.courseName+"\n"+course.instructorName+"\n"+course.courseDetail+" EKLEND�");
		}
		public void GetAll(Course []courses) {
			System.out.println("KURSLAR L�STELEND�");
			for(Course course:courses) {
				System.out.println(course.courseName);
			}
		}
		
		public void Delete(Course course) {
			System.out.println("KURS S�L�ND�");
		}
}
