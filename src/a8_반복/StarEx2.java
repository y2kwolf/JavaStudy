package a8_반복;

public class StarEx2 {

	public static void main(String[] args) {
		
		// 별과제 1
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
		System.out.println();
		
		// 별과제 2
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
		System.out.println();
		
		// 별과제 3
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5 - i - 1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
		System.out.println();
		
		// 별과제 4
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
		System.out.println();
		
		// 별과제 5
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5 - i - 1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < (i * 2) + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
		
	}

}
