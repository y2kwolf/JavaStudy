package a8_�ݺ�;

public class ContinueEx {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "��(��) ¦���Դϴ�.");
				continue;
			}
			System.out.println(i + "��(��) Ȧ���Դϴ�.");
		}
		
	}

}