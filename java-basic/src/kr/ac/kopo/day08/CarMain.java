package kr.ac.kopo.day08;

// ����Ŭ����
public class CarMain {

	public static void main(String[] args) {
		
		Car c = new Car();
		Car c2 = new Car();
		
		c.name = "�ҳ�Ÿ";
		c.price = 3600;
		
		c2.name = "�׷���";
		c2.price = 4200;
		
		System.out.println("�ڵ����� : " + c.name + ", ���� : " + c.price + "����");
		System.out.println("�ڵ����� : " + c2.name + ", ���� : " + c2.price + "����");
	}
}
