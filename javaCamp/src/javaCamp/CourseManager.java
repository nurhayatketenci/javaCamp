package javaCamp;

public class CourseManager {
        public void Add(Course course) {
			System.out.println(course.courseName+"\n"+course.courseDetail+" EKLENDÝ");
		}
		public void GetAll(Course []courses) {
			System.out.println("KURSLAR LÝSTELENDÝ");
			for(Course course:courses) {
				System.out.println(course.courseName);
			}
		}		
}
