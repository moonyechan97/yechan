package kr.ac.kopo.day05;

public class ArrayMain04 {

	public static void main(String[] args) {
		
        int sum = 0 ;
        float average = 0f;
        
        int[] score = {100, 88, 100, 100, 90};
        
        for (int i = 0 ; i < score.length ; i++) {
           sum += score[i];
        }
        average = sum / (float)score.length; // ������� float�� ��� ����.
        
        System.out.println("���� : " + sum);
        System.out.println("��� : " + average);
        }
}
