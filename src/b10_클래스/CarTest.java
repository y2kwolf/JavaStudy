package b10_Ŭ����;

public class CarTest {

	public static void main(String[] args) {
		// sonata ������
		// ������: �����ڵ���
		// ��: �ҳ�Ÿ
		// ����: ��
		// ����: 2019
		
		// k7
		// ������: ����ڵ���
		// ��: k7
		// ����: ȭ��Ʈ
		// ����: 2020
		
		// tesla_model3
		// ������: tesla
		// ��: model3
		// ����: �ǹ�
		// ����: 2021
		
		Car sonata = new Car();
		Car k7 = new Car();
		Car model3 = new Car();
		
		sonata.setCompany("�����ڵ���");
		k7.setCompany("����ڵ���");
		model3.setCompany("tesla");
		
		sonata.setModel("�ҳ�Ÿ");
		k7.setModel("k7");
		model3.setModel("model3");
		
		sonata.setColor("��");
		k7.setColor("ȭ��Ʈ");
		model3.setColor("�ǹ�");
		
		sonata.setYear(2019);
		k7.setYear(2020);
		model3.setYear(2021);
		
		sonata.carInfo();
		k7.carInfo();
		model3.carInfo();
	}

}
