package MyPackage;

class Person{
	private String name;
	private int age;
	
	public Person(String n,int a) {
		name=n;
		age=a;
	}
	
	public String get_name() {
		return name;
	}
	
	public int get_age() {
		return age;
	}
}

public class Student extends Person{
	private int grade;
	private double gpa;
	
	public Student(String n,int a,int gr,double g) {
		super(n,a);
		grade=gr;
		gpa=g;
	}
	
	public void Show_info() {
		System.out.println("이름:"+get_name());
		System.out.println("나이:"+get_age());
		System.out.println("학년:"+grade);
		System.out.println("평점:"+gpa+"\n");
	}
}
