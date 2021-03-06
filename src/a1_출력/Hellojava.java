package a1_출력;
/*
Java 공통 명명 규칙 "규칙, 패키지, 클래스, 메소드, 변수"
 
1) 규칙
1. 대소문자가 구분되며 길이에 제한이 없다.
2. 예약어를 사용해서는 안 된다.
3. 숫자로 시작해서는 안 된다.
4. 특수문자는 '_' 와 '$'만을 허용한다.
5. 파스칼 표기법 (PascalCase)과 카멜 표기법(camelCase)를 사용한다.
6. 반의어는 반드시 대응하는 개념으로 사용해야 한다.
※ PascalCase : 모든 단어에서 첫 번째 문자는 대문자이며 나머지는 소문자이다.
※ camelCase : 최초에 사용된 단어를 제외한 첫 번째 문자가 대문자이며 나머지는 소문자이다. 

2) 패키지 명명 규칙
1. 패키지명은 표준 패턴을 따라야 한다.
      (ex. [com].[Company].[Project].[TopPackage].[LowerPackage])
2. 패키지명은 가급적 한 단어의 명사를 사용한다.
      (ex. com.nexon.sudden.member.object (o) / sudden.memberObject (x)
3) 클래스 명명 규칙
1. 클래스명에는 파스칼을 사용한다.
     (ex. public class HelloWorld {})
2. 인터페이스에는 특별한 접두사나 접미사를 사용하지 않고 파스칼을 사용한다.
     (ex. public interface Animal {})
3. 인터페이스를 구현한 클래스에는 특별한 접두사나 접미사를 사용하지 않고 파스칼을 사용한다.
     (ex. public class Tiger implements animal{})
4. 추상 클래스에는 특별한 접두사 접미사를 사용하지 않고 파스칼을 사용한다.
     (ex. public abstract class Animal {})

4) 메소드 명명 규칙
1. 메소드명에는 파스칼 표기법을 사용한다.
     (ex. public void SendMessage(String message) {} )
2. 속성에 접근하는 메소드명의 접두사는 'get','set'을 사용한다.
     (ex. public void setDisplayName)
     (ex. public void getDisplayName)
3. 데이터를 조회하는 메소드명의 접두사는 find를 사용한다.
     (ex. public void findData(String data){})
4. 데이터를 입력하는 메소드명의 접두사는 input을 사용한다.
     (ex. public void inputData(HashMap data){})
5. 데이터를 변경하는 메소드명의 접두사는 modify를 사용한다.
     (ex. public void modifyData(HashMap data){})
6. 데이터를 삭제하는 메소드명의 접두사는 delete를 사용한다.
     (ex. public void deleteData(String data){})
7. 데이터를 초기화 하는 메소드명의 접두사는 initialize을 사용한다.
     (ex. public void initData(String data){})
8. 반환값의 타입이 boolean인 메소드는 접두사로 is를 사용한다.
     (ex. public void isData(String Data){})
9. 데이터를 불러오는 메소드명의 접두사는 load를 사용한다.
     (ex. public void loadData(){})
10. 데이터가 있는지 확인하는 메소드명의 접두사는 has를 사용한다.
     (ex. public void hasData(){})
11. 보다 지능적인 set이 요구될때 사용하는 메소드명의 접두사는 register를 사용한다.
     (ex. public void registerAccount(){})
12. 새로운 객체를 만든뒤 해당 객체를 리턴해주는 메소드명의 접두사는 create를 사용한다.
     (ex. public void createAccount(){})
13. 해당 객체를 다른 형태의 객체로 변환해주는 메소드명의 접두사는 to를 사용한다.
     (ex. public void toString(){})
14. 해당 객체가 복수인지 단일인지 구분하는 메서드명의 접미사는 s를 사용한다.
     (ex. public void getMembers(){})
15. B를 기준으로 A를 하겠다는 메소드명의 전치사는 By를 사용한다.
     (ex. public void getUserByName(String name){})
16. 반환값의 타입이 boolean인 메소드는 접두사로 is를 사용한다.
     (ex. public void isData(String Data){})
17. 데이터를 불러오는 메소드명의 접두사는 load를 사용한다.
     (ex. public void loadData(){})
18. 데이터가 있는지 확인하는 메소드명의 접두사는 has를 사용한다.
     (ex. public void hasData(){})
19. 보다 지능적인 set이 요구될때 사용하는 메소드명의 접두사는 register를 사용한다.
     (ex. public void registerAccount(){})
20. 새로운 객체를 만든뒤 해당 객체를 리턴해주는 메소드명의 접두사는 create를 사용한다.
     (ex. public void createAccount(){})
21. 해당 객체를 다른 형태의 객체로 변환해주는 메소드명의 접두사는 to를 사용한다.
     (ex. public void toString(){})
22. 해당 객체가 복수인지 단일인지 구분하는 메서드명의 접미사는 s를 사용한다.
     (ex. public void getMembers(){})
23. B를 기준으로 A를 하겠다는 메소드명의 전치사는 By를 사용한다.
     (ex. public void getUserByName(String name){})
 
5) 변수 명명 규칙
1. 변수와 메소드의 파라미터에는 카멜표기법을 사용한다.
2. 변수에 약어를 사용하지 않고 모든 의미를 충분히 담는다.
3. 한 글자로 된 이름을 사용하지 않는다.
4. 선언된 지점에서 초기화하며, 가능한 사용범위를 최소화 한다.
     (ex. 숫자 0 레퍼런스 null)
5. 반복문에서 인덱스로 사용할 변수는 i,j,k 등으로 사용한다.
     (ex. for(int i = 0; i < 10; i++){})
6. 지역변수와 멤버변수(전역변수)는 변수명 앞에 밑줄(_)을 사용하여 구별한다.
7. boolean타입의 변수는 접두사로 is를 사용한다
     (ex. isCheck)
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
