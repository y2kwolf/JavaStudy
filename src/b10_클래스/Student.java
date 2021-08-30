package b10_Ŭ����;

public class Student {

	private String name;
	private String schoolName;
	private int year; //�г�
	
	
	public Student() { //�⺻ ������
		
	}
	
	public Student(String name,  int year) {
		super(); //��� ����
		
		this.name = name + " �л�";
		this.year = year;
		this.showInfo();
	}
	
	public Student(String name, String schoolName, int year) {
		super(); //��� ����
		
		this.name = name + " �л�";
		this.schoolName = schoolName;
		this.year = year;
		this.showInfo();
	}
	
	public void setName(String name) {
		this.name = name + " �л�";
	}
	
	public String getName() {
		return name;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void getFreebies() {
		Regular regular = new Regular();
		
		regular.setYearCheck(year, schoolName);
		
		if(regular.isYearCheck()) {
			System.out.println("����ǰ �����");
		} else {
			System.out.println("����� ����");
		}
	}

	public void showInfo() {
		System.out.println("�л� ����");
		System.out.println("�̸�: " + name);
		System.out.println("�б�: " + schoolName);
		System.out.println("�г�: " + year);
	}

}