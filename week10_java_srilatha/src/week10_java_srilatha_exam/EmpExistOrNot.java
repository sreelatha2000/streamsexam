package week10_java_srilatha_exam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class EmpExistOrNot {
	
	
	public static void main(String[] args) {
		EmpExistOrNot emp= new EmpExistOrNot();
		emp.jTest();
		
	}
	@Test
	public void jTest()
	{
		MainTest main1= new MainTest();
		List<Employee> employeeList=main1.test();
      Stream name = employeeList.stream().map(e->e.getName());
       assertEquals(name, "Ram");
	}
	


}
