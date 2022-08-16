package myfirst;

public class Student {
	//properties
	private String name;
	private String degree;
	private String mobile;
	// static member
	static int max=100;
	
	// constructor

	public Student(String name, String degree, String mobile) {
		super();
		this.name = name;
		this.degree = degree;
		this.mobile = mobile;
	}

//	public static int getStudentID() {
//		return studentID;
//	}
//
//	public static void setStudentID(int studentID) {
//		Student.studentID = studentID;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public void print() {
		System.out.println("Studnt ID :" +getNextStudentID());
		System.out.println("name" + this.name);
		System.out.println("degree :"+this.degree);
		System.out.println("mobile :"+this.mobile);
	}
	
	public static int getNextStudentID() {
		return max++;
	}
	
}
