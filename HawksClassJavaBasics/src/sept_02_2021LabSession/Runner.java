package sept_02_2021LabSession;
public class Runner {
public static void main(String[] args) {
	
	WalmartEmployeeDB alexanderiaBranch = new WalmartEmployeeDB (5);
	WalmartEmployeeDB arlingtonBranch = new WalmartEmployeeDB (5);
	
	alexanderiaBranch.AddEmployee(new Employee("Jack", "Mike", "Jack@yahoo.com", "mike@12345", "01/01/1990"));
	alexanderiaBranch.AddEmployee(new Employee("Tome", "Jim", "Jack@yahoo.com", "mike@12345", "01/01/1980"));
			
	
			
	arlingtonBranch.AddEmployee(new Employee("emp1", "omar", "omar@yahoo.com", "omar@12345", "01/01/2000"));
	arlingtonBranch.AddEmployee(new Employee("emp2", "omar", "omar@yahoo.com", "omar@12345", "01/01/2000"));
	arlingtonBranch.AddEmployee(new Employee("emp3", "omar", "omar@yahoo.com", "omar@12345", "01/01/2000"));
	arlingtonBranch.AddEmployee(new Employee("emp4", "omar", "omar@yahoo.com", "omar@12345", "01/01/2000"));
	arlingtonBranch.AddEmployee(new Employee("emp5", "omar", "omar@yahoo.com", "omar@12345", "01/01/2000"));
	arlingtonBranch.AddEmployee(new Employee("emp6", "omar", "omar@yahoo.com", "omar@12345", "01/01/2000"));
	
	
			System.out.println("This is Alexanderia Branch: " +alexanderiaBranch.getBranchCount());		
			System.out.println("this is Arlington Branch: " +arlingtonBranch.getBranchCount());
			System.out.println("Global WalmartEmployeeDB Count: " +WalmartEmployeeDB.getAllEmployeesCount());
					
			System.out.println(alexanderiaBranch);
			System.out.println(arlingtonBranch);
			
			WalmartEmployeeDB.printGlobalOfEmployees();
	
}
}
