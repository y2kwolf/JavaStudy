package a1_���;
/*
Java ���� ��� ��Ģ "��Ģ, ��Ű��, Ŭ����, �޼ҵ�, ����"
 
1) ��Ģ
1. ��ҹ��ڰ� ���еǸ� ���̿� ������ ����.
2. ���� ����ؼ��� �� �ȴ�.
3. ���ڷ� �����ؼ��� �� �ȴ�.
4. Ư�����ڴ� '_' �� '$'���� ����Ѵ�.
5. �Ľ�Į ǥ��� (PascalCase)�� ī�� ǥ���(camelCase)�� ����Ѵ�.
6. ���Ǿ�� �ݵ�� �����ϴ� �������� ����ؾ� �Ѵ�.
�� PascalCase : ��� �ܾ�� ù ��° ���ڴ� �빮���̸� �������� �ҹ����̴�.
�� camelCase : ���ʿ� ���� �ܾ ������ ù ��° ���ڰ� �빮���̸� �������� �ҹ����̴�. 

2) ��Ű�� ��� ��Ģ
1. ��Ű������ ǥ�� ������ ����� �Ѵ�.
      (ex. [com].[Company].[Project].[TopPackage].[LowerPackage])
2. ��Ű������ ������ �� �ܾ��� ��縦 ����Ѵ�.
      (ex. com.nexon.sudden.member.object (o) / sudden.memberObject (x)
3) Ŭ���� ��� ��Ģ
1. Ŭ�������� �Ľ�Į�� ����Ѵ�.
     (ex. public class HelloWorld {})
2. �������̽����� Ư���� ���λ糪 ���̻縦 ������� �ʰ� �Ľ�Į�� ����Ѵ�.
     (ex. public interface Animal {})
3. �������̽��� ������ Ŭ�������� Ư���� ���λ糪 ���̻縦 ������� �ʰ� �Ľ�Į�� ����Ѵ�.
     (ex. public class Tiger implements animal{})
4. �߻� Ŭ�������� Ư���� ���λ� ���̻縦 ������� �ʰ� �Ľ�Į�� ����Ѵ�.
     (ex. public abstract class Animal {})

4) �޼ҵ� ��� ��Ģ
1. �޼ҵ���� �Ľ�Į ǥ����� ����Ѵ�.
     (ex. public void SendMessage(String message) {} )
2. �Ӽ��� �����ϴ� �޼ҵ���� ���λ�� 'get','set'�� ����Ѵ�.
     (ex. public void setDisplayName)
     (ex. public void getDisplayName)
3. �����͸� ��ȸ�ϴ� �޼ҵ���� ���λ�� find�� ����Ѵ�.
     (ex. public void findData(String data){})
4. �����͸� �Է��ϴ� �޼ҵ���� ���λ�� input�� ����Ѵ�.
     (ex. public void inputData(HashMap data){})
5. �����͸� �����ϴ� �޼ҵ���� ���λ�� modify�� ����Ѵ�.
     (ex. public void modifyData(HashMap data){})
6. �����͸� �����ϴ� �޼ҵ���� ���λ�� delete�� ����Ѵ�.
     (ex. public void deleteData(String data){})
7. �����͸� �ʱ�ȭ �ϴ� �޼ҵ���� ���λ�� initialize�� ����Ѵ�.
     (ex. public void initData(String data){})
8. ��ȯ���� Ÿ���� boolean�� �޼ҵ�� ���λ�� is�� ����Ѵ�.
     (ex. public void isData(String Data){})
9. �����͸� �ҷ����� �޼ҵ���� ���λ�� load�� ����Ѵ�.
     (ex. public void loadData(){})
10. �����Ͱ� �ִ��� Ȯ���ϴ� �޼ҵ���� ���λ�� has�� ����Ѵ�.
     (ex. public void hasData(){})
11. ���� �������� set�� �䱸�ɶ� ����ϴ� �޼ҵ���� ���λ�� register�� ����Ѵ�.
     (ex. public void registerAccount(){})
12. ���ο� ��ü�� ����� �ش� ��ü�� �������ִ� �޼ҵ���� ���λ�� create�� ����Ѵ�.
     (ex. public void createAccount(){})
13. �ش� ��ü�� �ٸ� ������ ��ü�� ��ȯ���ִ� �޼ҵ���� ���λ�� to�� ����Ѵ�.
     (ex. public void toString(){})
14. �ش� ��ü�� �������� �������� �����ϴ� �޼������ ���̻�� s�� ����Ѵ�.
     (ex. public void getMembers(){})
15. B�� �������� A�� �ϰڴٴ� �޼ҵ���� ��ġ��� By�� ����Ѵ�.
     (ex. public void getUserByName(String name){})
16. ��ȯ���� Ÿ���� boolean�� �޼ҵ�� ���λ�� is�� ����Ѵ�.
     (ex. public void isData(String Data){})
17. �����͸� �ҷ����� �޼ҵ���� ���λ�� load�� ����Ѵ�.
     (ex. public void loadData(){})
18. �����Ͱ� �ִ��� Ȯ���ϴ� �޼ҵ���� ���λ�� has�� ����Ѵ�.
     (ex. public void hasData(){})
19. ���� �������� set�� �䱸�ɶ� ����ϴ� �޼ҵ���� ���λ�� register�� ����Ѵ�.
     (ex. public void registerAccount(){})
20. ���ο� ��ü�� ����� �ش� ��ü�� �������ִ� �޼ҵ���� ���λ�� create�� ����Ѵ�.
     (ex. public void createAccount(){})
21. �ش� ��ü�� �ٸ� ������ ��ü�� ��ȯ���ִ� �޼ҵ���� ���λ�� to�� ����Ѵ�.
     (ex. public void toString(){})
22. �ش� ��ü�� �������� �������� �����ϴ� �޼������ ���̻�� s�� ����Ѵ�.
     (ex. public void getMembers(){})
23. B�� �������� A�� �ϰڴٴ� �޼ҵ���� ��ġ��� By�� ����Ѵ�.
     (ex. public void getUserByName(String name){})
 
5) ���� ��� ��Ģ
1. ������ �޼ҵ��� �Ķ���Ϳ��� ī��ǥ����� ����Ѵ�.
2. ������ �� ������� �ʰ� ��� �ǹ̸� ����� ��´�.
3. �� ���ڷ� �� �̸��� ������� �ʴ´�.
4. ����� �������� �ʱ�ȭ�ϸ�, ������ �������� �ּ�ȭ �Ѵ�.
     (ex. ���� 0 ���۷��� null)
5. �ݺ������� �ε����� ����� ������ i,j,k ������ ����Ѵ�.
     (ex. for(int i = 0; i < 10; i++){})
6. ���������� �������(��������)�� ������ �տ� ����(_)�� ����Ͽ� �����Ѵ�.
7. booleanŸ���� ������ ���λ�� is�� ����Ѵ�
     (ex. isCheck)
 */

public class Hellojava {

	public static void main(String[] args) {
		// �ּ�ó��
		System.out.print("Hello, Java!");		
		// C -> printf()
		// Python -> print()
		// System: �ü���� ����� ���
		// out: �ü���� ����� ����� ����ϴ� ���
		// print: ����� ����ϴ� ����� �Է��� ��ŭ�� ���(�ٹٲ� X)
		System.out.println("Hello, Java2!");
		System.out.print("Hello, Java3!");
		// println: ����� ����ϴ� ��� �� ������ ���(�ٹٲ� �ڵ�)
		// ���� ����Ű (ctrl + F11)
		// ctrl++ �ڵ�â zoom
	}

}
