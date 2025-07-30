package indraja;
class Student{
	int rollNumber;
	String name;
	int m1,m2,m3;
	float avg;
	
	Student(int rollNumber, String name, int m1,int m2, int m3){
	this.rollNumber=rollNumber;
	this.name=name;
	this.m1=m1;
	this.m2=m2;
	this.m3=m3;
}
	public void calculataverage() {
		avg=(m1+m2+m3)/3;
		
	}
	public void displaydetails() {
		System.out.println("Roll NUmber:"+rollNumber);
		System.out.println("Name:"+name);
		System.out.println("Mark1:"+m1+ "\tMarks2:"+m2+"\tMark3:"+m3);
		System.out.println("Average:"+avg);
	}

public class StudentDemo {
	public static void main(String[] args) {
		Student s1=new Student(1,"Demo",20,30,40);
		s1.calculataverage();
		s1.displaydetails();
		Student s2=new Student(2,"hope",10,40,50);
		s2.calculataverage();
		s2.displaydetails();
		
	}
}

}
