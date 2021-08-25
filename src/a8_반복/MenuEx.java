package a8_반복;

import java.util.Scanner;

public class MenuEx {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		boolean mainflag = true;
		
		while(mainflag) {
			System.out.println("[프로그램 메뉴]");
			System.out.println("1. 진상영 폴더 만들기");
			System.out.println("q. 프로그램 종료");
			System.out.print("명령을 입력하세요: ");
			String selecter = in.nextLine(); // 문자열 입력
			System.out.println("");
			if(selecter.equals("1")) {
				while(true) {
					System.out.println("[진상영 폴더]");
					System.out.println("1. JavaStudy 폴더 만들기");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.print("명령을 입력하세요: ");
					selecter = in.nextLine();				
					System.out.println("");
					
					if(selecter.equals("1")) {
						System.out.println("[JavaStudy 폴더]");
					}else if(selecter.equals("b")) {
						break;
					} else if(selecter.equals("q")) {
						System.out.println("프로그램 종료중...");
						mainflag = false;
						break;
					}else {
						System.out.println("잘못된 입력입니다.");
					}
				}				
				
			}else if(selecter.equals("q")){
				System.out.println("프로그램 종료중...");
				break;
			}else {
				System.out.println("잘못된 입력입니다.");
			}
		}
		
		System.out.println("프로그램 종료!");
	}

}
