package a1_출력;
/*
Java 명명규칙
1) 규칙
- 대소문자가 구분되며 길이에 제한이 없다
- 예약어 사용 X
- 숫자 시작 X
- 특수문자 '_'와 '$' 만 허용
- 파스칼 표기법(PascalCase)과 카멜 표기법(camelCase) 사용
- 반의어는 반드시 대응하는 개념으로 사용

2) 패키지
- 패키지명은 표준 패턴을 따름 (ex. [com].[Company].[Project].[TopPackage].[LowerPackage])
- 패키지명은 가급적 한 단어의 명사를 사용 (ex. com.nexon.sudden.member.object(O))

3) 클래스
- 파스칼 표기법 사용
- 인터페이스 및 구현한 클래스에는 특별한 접두사나 접미사를 미사용, 파스칼 사용
- 추상 클래스에는 특별한 접두사 접미사 미사용, 파스칼 사용

4) 메소드
- 파스칼 표기법 사용
- 속성에 접근하는 메소드명의 접두사는 'get','set'을 사용
- 데이터 조회하는 메소드명의 접두사는 'find'을 사용
- 데이터 입력하는 메소드명의 접두사는 'input'을 사용
- 데이터 변경하는 메소드명의 접두사는 'modify'를 사용
- 데이터 삭제하는 메소드명의 접두사는 'delete'를 사용
- 데이터 조기화하는 메소드명의 접두사는 'initialize'를 사용
- 반환값의 타입이 boolean인 메소드는 접두사로 'is'를 사용
- 데이터를 불러오는 메소드명의 접두사는 'load'를 사용
- 데이터가 있는지 확인하는 메소드명의 접두사는 'has'를 사용
- 


 */

public class Hellojava {

	public static void main(String[] args) {
		// 주석처리
		System.out.print("Hello, Java!");		
		// C -> printf()
		// Python -> print()
		// System: 운영체제의 기능을 사용
		// out: 운영체제의 기능중 출력을 담당하는 기능
		// print: 출력을 담당하는 기능중 입력한 만큼만 출력(줄바꿈 X)
		System.out.println("Hello, Java2!");
		System.out.print("Hello, Java3!");
		// println: 출력을 담당하는 기능 중 한줄을 출력(줄바꿈 자동)
		// 실행 단추키 (ctrl + F11)
		// ctrl++ 코딩창 zoom
	}

}
