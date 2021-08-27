package a9_메소드;
/*
1. 오버로딩
- 하나의 메소드 이름으로 여러기능을 구현하기 때문에 '과적하다'에서 나온 이름
- 두 메서드가 같은 이름을 갖고 있으나 매개변수의 수나 자료형(type)이 다른 경우
- 프로그래밍의 가독성을 증가
- 리턴값만 다른것은 오버로딩 할 수 없다
 */

public class OverloadingEx {
	
	public int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	public int add(String num1) {
		int result = Integer.parseInt(num1) + Integer.parseInt(num1); // 문자열 숫자 형변환
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
		double result = num1 * num2; // 실수형태로 암묵적 형변환
		return result;
	}
	
	
	public void mainMethod() {
		int numberSum = add(5, 10);
		int numberSum2 = add("10");
		int numberMul = mul(3, 3, 5);
		double numberMul2 = mul(3, 3.5);
		System.out.println("수의 합은? " + numberSum);
		System.out.println("수의 합은? " + numberSum2);
		System.out.println("수의 곱은? " + numberMul);
		System.out.println("수의 곱은? " + numberMul2);
	}

	public static void main(String[] args) {
		OverloadingEx main = new OverloadingEx();
		main.mainMethod();
	}

}
