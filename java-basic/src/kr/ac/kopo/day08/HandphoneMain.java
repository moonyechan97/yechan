package kr.ac.kopo.day08;

class Handphone {
	String name;
	String phone;
	String company;
}

public class HandphoneMain {

	public static void main(String[] args) {
		
		Handphone hp = new Handphone();
		hp.name = "ȫ�浿";
		hp.phone = "010-1111-2222";
		hp.company = "�Ｚ";
		
		Handphone hp2 = new Handphone();
		hp2.name = "���浿";
		hp2.phone = "010-3333-4444";
		hp2.company = "����";
		
		Handphone hp3 = new Handphone();
		hp3.name = "��浿";
		hp3.phone = "010-5555-6666";
		hp3.company = "����ζ�";
		
		Handphone[] hpArr = {hp, hp2, hp3};
		
		for(Handphone p : hpArr) {
			System.out.println("�����ָ� : " + p.name + ", �ڵ�����ȣ : " + p.phone + ", ������ : " + p.company);
		}
		
		System.out.println("---------------------------------------");
		
		for(int i =0; i < hpArr.length; i++) {
			System.out.println("�����ָ� : " + hpArr[i].name + ", �ڵ�����ȣ : " + hpArr[i].phone + ", ������ : " + hpArr[i].company);
		}
	}
}