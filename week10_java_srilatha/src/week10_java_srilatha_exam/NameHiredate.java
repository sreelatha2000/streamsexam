package week10_java_srilatha_exam;

import java.util.List;

public class NameHiredate {
	
	public static void main(String[] args) {
		MainTest main1= new MainTest();
		List<Employee> employeeList=main1.test();
		employeeList.stream().filter(e->e.getYearOfJoining()>2015).forEach(e1->System.out.println(e1.getName()));
	}

}
