package week1.day1;

public class Student {
	
	String name = "Durai Vengkades" ;
	int rollNo = 14071995;
	
	public void collegeName(String collegeName) {
		System.out.println("Collage Name: "+collegeName);
	}
	
	private void college(String dept) {
		System.out.println("Department: "+dept);
	}
	
	void collegeBusNo(int busNo) {
		System.out.println("Bus Number: "+busNo);
	}
	
	public static void main(String[] args) {
		
		Student student = new Student();
		System.out.println("Student Name: "+student.name);
		System.out.println("Roll  Number: "+student.rollNo);
		student.collegeName("VSBCETC");
		student.college("Mechanical");
		student.collegeBusNo(20);
	}
}
