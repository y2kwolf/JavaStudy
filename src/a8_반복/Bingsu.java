package a8_반복;

public class Bingsu {
	
	String makeBingsu(String material, int materialCount, String material2) {
		String bingsu = material + materialCount + "개와 " + material2 + "가 들어간 빙수";
		return bingsu;
	}
	
	void voidTest() {
		System.out.println("보이드 테스트 메소드");
	}
	
	public static void main(String[] args) {	
		
		Bingsu b = new Bingsu();	
		String material = "딸기";
		String material2 = "우유";
		String bingsu = b.makeBingsu(material, 2, material2);		
		System.out.println(bingsu);
		
		b.voidTest();

	}

}
