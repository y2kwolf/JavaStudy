package b10_Ŭ����;

public class StudentTest {

	public static void main(String[] args) {
		Student kim = new Student("������", "�ڸ��ƾ���Ƽ", 4);
		Student lee = new Student("������", "�ڸ��ƾ���Ƽ", 2);
		Student jin = new Student("����", "��������д���", 3);
		
		//kim.name = "������"; //   .�� �ش� �޸� �ּҰ��� �����Ѵٶ�� �Ѵ�.
		
		kim.showInfo();
		
		Integer i = new Integer(100);
		
		System.out.println(kim.hashCode());
		System.out.println(i.hashCode());
		
		kim.getFreebies();
		lee.getFreebies();
	}

}