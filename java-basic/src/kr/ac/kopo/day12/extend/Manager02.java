package kr.ac.kopo.day12.extend;

public class Manager02 extends Employee {

	Employee[] empList;    // 관리사원 목록
	
	Manager02() {
		super();
	}
	
	Manager02(int no, String name, int salary, String grade, Employee[] empList) {
		this.no = no;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		this.empList = empList;
	}
	
	void info() {
		super.info();
		System.out.println("------------------------------");
		System.out.println("\t< 관리사원 리스트 >");
		System.out.println("------------------------------");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("------------------------------");
	}
}