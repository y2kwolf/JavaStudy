package a2_����;

public class Myinfo {

	public static void main(String[] args) {
		/** <�ڷ���>
		 * ����(boolean) = true, false
		 * boolean ������ = true;
		 * boolean ������ = false;
		 * 
		 * ������(char) ĳ���� = a~z, �ѱ�(1���ڸ�)
		 * char ������ = 'a';
		 * char ������ = '��';
		 * char ������ = '1';
		 * char ������ = '$';
		 * 
		 * ���ڿ�(String) = "���ڿ��� ������ �� �ֽ��ϴ�."
		 * String ������ = "�ȳ��ϼ���. �����Դϴ�."
		 * 
		 * ������(int) Integer = 0 ~ 10 10������ ǥ��
		 * int ������ = 100;
		 * 
		 * �Ǽ���(double) = 0.0 ~ 0.9 �Ǽ�����(�Ҽ���) ǥ��
		 * double ������ = 3.14159; 
		*/
		
		int year = 1973;
		int month = 9;
		int day = 20;
		char f = '��';
		char s = '��';
		char th = '��';
		String name = "����";
		double left = 0.3;
		double right = 0.3;
		boolean maleFemale = true;
		
		System.out.print("�������: ");
		System.out.print(year);
		System.out.print("�� ");
		System.out.print(month);
		System.out.print("�� ");
		System.out.print(day);
		System.out.println("��");
				
		System.out.print("�̸�: ");
		System.out.print(f);
		System.out.print(s);
		System.out.println(th);
		
		System.out.print("�̸�: ");
		System.out.println(name);
				
		System.out.print("�÷�(R): ");
		System.out.println(right);
				
		System.out.print("�÷�(L): ");
		System.out.println(left);
		
		System.out.print("����: ");
		System.out.println(maleFemale);

	}

}
