package a9_�޼ҵ�;
/*
1. �����ε�
- �ϳ��� �޼ҵ� �̸����� ��������� �����ϱ� ������ '�����ϴ�'���� ���� �̸�
- �� �޼��尡 ���� �̸��� ���� ������ �Ű������� ���� �ڷ���(type)�� �ٸ� ���
- ���α׷����� �������� ����
- ���ϰ��� �ٸ����� �����ε� �� �� ����
 */

public class OverloadingEx {
	
	public int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	public int add(String num1) {
		int result = Integer.parseInt(num1) + Integer.parseInt(num1); // ���ڿ� ���� ����ȯ
		return result;
	}
	
	public int mul(int num1, int num2, int num3) {
		int result = num1 * num2 * num3;
		return result;
	}
	
	public double mul(int num1, double num2) {
		double result = num1 * num2; 
		return result;
	}
	
	public double mul(int num1, int num2) {
		double result = num1 * num2; // �Ǽ����·� �Ϲ��� ����ȯ
		return result;
	}
	
	
	public void mainMethod() {
		int numberSum = add(5, 10);
		int numberSum2 = add("10");
		int numberMul = mul(3, 3, 5);
		double numberMul2 = mul(3, 3.5);
		System.out.println("���� ����? " + numberSum);
		System.out.println("���� ����? " + numberSum2);
		System.out.println("���� ����? " + numberMul);
		System.out.println("���� ����? " + numberMul2);
	}

	public static void main(String[] args) {
		OverloadingEx main = new OverloadingEx();
		main.mainMethod();
	}

}
