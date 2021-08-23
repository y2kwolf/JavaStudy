package a8_반복;

import java.util.Scanner;

public class StarEx1 {

	public static void main(String[] args) {
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * ******
		 * *******
		 * ********
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.print("별의 갯수를 입력하세요: ");
		int num = input.nextInt();
		System.out.println();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
