package week10_java_srilatha_exam;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NameAllEmpDept {
	public static void main(String[] args) {
		MainTest main1= new MainTest();
		List<Employee> employeeList=main1.test();
		 employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment
			,Collectors.groupingBy(Employee::getName))).entrySet().forEach(e->{System.out.println(e.getKey().toUpperCase()+"  : ");
			e.getValue().entrySet().forEach(e1->{System.out.println(e1.getKey());});
					
			}
				);
		
		
	}

}
