package b10_클래스;

public class StudentTest {

	public static void main(String[] args) {
		
		Student kim = new Student(); // 생성자(Constructor) -> 클래스명과 같다.
		kim.name = "김재성";
		kim.schoolName = "부산대학교";
		kim.year = "1";
		kim.showInfo();
		
		Student lee = new Student();		
		lee.name = "이효원";
		lee.schoolName = "부경대학교";
		lee.year = "4";
		lee.showInfo();
		
		System.out.println(kim); // 객체의 메모리주소 반환
		System.out.println(lee);
	}

}