package a8_�ݺ�;

import java.util.Scanner;

public class GuguDan {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("�ܼ��� �Է��� �ּ���: ");
		int dan = input.nextInt();
		int i = 0;
		
		System.out.println(dan + "��");
		// System.out.printf("%d��\n", dan);
		
		while(i < 9) {
			int temp_i = i + 1;
			System.out.println(dan + " X " + temp_i + " = " + 2 * temp_i);
			i++;
		}
		
		System.out.println("");
		
		for(i = 0; i < 9; i++) {
			int temp_i = i + 1;
			System.out.println(dan + " X " + temp_i + " = " + dan * temp_i);
		}		
		
	}

}
