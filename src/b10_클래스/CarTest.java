package b10_클래스;

public class CarTest {

	public static void main(String[] args) {
		// sonata 변수명
		// 제조사: 현대자동차
		// 모델: 소나타
		// 색상: 블랙
		// 연식: 2019
		
		// k7
		// 제조사: 기아자동차
		// 모델: k7
		// 색상: 화이트
		// 연식: 2020
		
		// tesla_model3
		// 제조사: tesla
		// 모델: model3
		// 색상: 실버
		// 연식: 2021
		
		Car sonata = new Car();
		Car k7 = new Car();
		Car model3 = new Car();
		
		sonata.setCompany("현대자동차");
		k7.setCompany("기아자동차");
		model3.setCompany("tesla");
		
		sonata.setModel("소나타");
		k7.setModel("k7");
		model3.setModel("model3");
		
		sonata.setColor("블랙");
		k7.setColor("화이트");
		model3.setColor("실버");
		
		sonata.setYear(2019);
		k7.setYear(2020);
		model3.setYear(2021);
		
		sonata.carInfo();
		k7.carInfo();
		model3.carInfo();
	}

}
