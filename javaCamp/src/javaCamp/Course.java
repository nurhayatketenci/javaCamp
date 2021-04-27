package javaCamp;

public class Course {
	public Course(){
	
	}
	
    
	public Course(int courseId,String courseName,String instructorName,String courseDetail) {
	this.courseId=courseId;
	this.courseName=courseName;
	this.instructorName=instructorName;
	this.courseDetail=courseDetail;
	}
	int courseId;
    String courseName;
    String instructorName;
    String courseDetail;
    
}
