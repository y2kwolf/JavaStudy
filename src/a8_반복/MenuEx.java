package a8_�ݺ�;

import java.util.Scanner;

public class MenuEx {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		boolean mainflag = true;
		
		while(mainflag) {
			System.out.println("[���α׷� �޴�]");
			System.out.println("1. ���� ���� �����");
			System.out.println("q. ���α׷� ����");
			System.out.print("����� �Է��ϼ���: ");
			String selecter = in.nextLine(); // ���ڿ� �Է�
			System.out.println("");
			if(selecter.equals("1")) {
				while(true) {
					System.out.println("[���� ����]");
					System.out.println("1. JavaStudy ���� �����");
					System.out.println("b. �ڷΰ���");
					System.out.println("q. ���α׷� ����");
					System.out.print("����� �Է��ϼ���: ");
					selecter = in.nextLine();				
					System.out.println("");
					
					if(selecter.equals("1")) {
						System.out.println("[JavaStudy ����]");
					}else if(selecter.equals("b")) {
						break;
					} else if(selecter.equals("q")) {
						System.out.println("���α׷� ������...");
						mainflag = false;
						break;
					}else {
						System.out.println("�߸��� �Է��Դϴ�.");
					}
				}				
				
			}else if(selecter.equals("q")){
				System.out.println("���α׷� ������...");
				break;
			}else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
		
		System.out.println("���α׷� ����!");
	}

}
