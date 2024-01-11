package week10_java_srilatha_exam;

import java.util.List;
import java.util.stream.Collectors;

public class SalesAndMarket {
	
	public static void main(String[] args) {
		MainTest main1= new MainTest();
		List<Employee> employeeList=main1.test();
		employeeList.stream().filter(e->e.getDepartment().equals("Sales")||
	e.getDepartment().equals("Marketing")).collect(Collectors.groupingBy(Employee::getDepartment
			,Collectors.groupingBy(Employee::getGender))).entrySet().forEach(e->{System.out.println(e.getKey());
			e.getValue().entrySet().forEach(e1->{System.out.println(e1.getKey()+" "+e1.getValue().size());});
					
			}
				);
		
	}


}
