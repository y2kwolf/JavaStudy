package b10_Ŭ����;

public class StudentTest {

	public static void main(String[] args) {
		
		Student kim = new Student(); // ������(Constructor) -> Ŭ������� ����.
		kim.name = "���缺";
		kim.schoolName = "�λ���б�";
		kim.year = "1";
		kim.showInfo();
		
		Student lee = new Student();		
		lee.name = "��ȿ��";
		lee.schoolName = "�ΰ���б�";
		lee.year = "4";
		lee.showInfo();
		
		System.out.println(kim); // ��ü�� �޸��ּ� ��ȯ
		System.out.println(lee);
	}

}