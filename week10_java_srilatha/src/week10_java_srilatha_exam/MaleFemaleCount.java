package week10_java_srilatha_exam;

import java.util.List;
import java.util.stream.Collectors;

public class MaleFemaleCount {
	
	public static void main(String[] args) {
		MainTest main1= new MainTest();
		List<Employee> employeeList=main1.test();
       employeeList.stream().collect(Collectors.groupingBy(Employee::getGender)).
       entrySet().forEach(e->System.out.println(e.getKey()+"   "+e.getValue().size()));
	}

}
