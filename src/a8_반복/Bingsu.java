package a8_�ݺ�;

public class Bingsu {
	
	String makeBingsu(String material, int materialCount, String material2) {
		String bingsu = material + materialCount + "���� " + material2 + "�� �� ����";
		return bingsu;
	}
	
	void voidTest() {
		System.out.println("���̵� �׽�Ʈ �޼ҵ�");
	}
	
	public static void main(String[] args) {	
		
		Bingsu b = new Bingsu();	
		String material = "����";
		String material2 = "����";
		String bingsu = b.makeBingsu(material, 2, material2);		
		System.out.println(bingsu);
		
		b.voidTest();

	}

}
