package javaCamp;

public class CourseManager {
        public void Add(Course course) {
			System.out.println(course.courseName+"\n"+course.courseDetail+" EKLEND�");
		}
		public void GetAll(Course []courses) {
			System.out.println("KURSLAR L�STELEND�");
			for(Course course:courses) {
				System.out.println(course.courseName);
			}
		}		
}
