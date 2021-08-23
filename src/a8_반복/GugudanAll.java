package a8_반복;

import java.util.Scanner;

public class GugudanAll {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("시작 단수를 입력해 주세요: ");
		int start = input.nextInt();
		
		System.out.print("마지막 단수를 입력해 주세요: ");
		int end = input.nextInt();		

		System.out.println();
		
		for(int dan = start; dan < end + 1; dan++) {
			System.out.println("<" + dan + "단>");
			
			for(int i = 0; i < 9; i++) {
				int temp_i = i + 1;
				System.out.println(dan + " X " + temp_i + " = " + dan * temp_i);
			}
			System.out.println();
		}

	}

}
