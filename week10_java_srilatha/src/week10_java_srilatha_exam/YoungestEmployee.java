package week10_java_srilatha_exam;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class YoungestEmployee {
	public static void main(String[] args) {
		MainTest main1= new MainTest();
		List<Employee> employeeList=main1.test();
		Set<Entry<String, Optional<Employee>>> o=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.
				minBy(Comparator.comparingDouble(Employee::getAge)))).entrySet();
		o.forEach(e1->System.out.println(e1.getKey()+" "+e1.getValue().get().getName()));
		
		
		
		
				
		}


}
