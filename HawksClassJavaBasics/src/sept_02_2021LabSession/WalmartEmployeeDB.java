package sept_02_2021LabSession;
public class WalmartEmployeeDB {

	// how many employees we have in total in all of walmart
	// we keep track employees of each branch
	// we also keep a list all of the employees of all of the branch
	
	private Employee [] employees; // this is a dynamic list that will be initializing for each branch / object of this class
	private int localCount; // this is a count of all of the employees of the branch
	private static int globalCount = 0; // this is a static count of all of the branches employees
	private static Employee [] allEmployees = new Employee [1000]; // this is  a list of all of the employees of all of the branch
	
		public WalmartEmployeeDB() {
			this.employees = new Employee [100];
			this.localCount = 0;
			
	}
		public WalmartEmployeeDB (int branchSize) {
			super();
			this.employees = new Employee[branchSize];
			this.localCount = 0;
		
	}
	public boolean AddEmployee (Employee emp) {
		System.out.println("adding emp " + localCount +" "+emp.getFirstName());
		if (localCount> employees.length-1) {
			System.out.println("Error: the system is full and can not accept new Employees!");
			return false;
			
		}
		if (globalCount> allEmployees.length-1) {
			System.out.println("Error: the Global system is full and can not accept new Employees!");
			return false;
		}	
		employees [localCount++] = emp;
		WalmartEmployeeDB.allEmployees[globalCount++] = emp;
		System.out.println("Employee Added:" + emp);
		return true;
	}
	public int getBranchCount() {
		return localCount;
	}
	public static int getAllEmployeesCount() {
		return globalCount;
		
	}
	public String toString() {
		String temp ="****START of Branch Employees";
		for (int i = 0; i < localCount; i++) {
			temp += (i+1)+ "." + employees[i]+ "\n";
			System.out.println((i+1) +". "+ employees[i]);
		}
		System.out.println();
			temp +="************* END of Branch Employees ************";
			return temp;
				
	}

	public static void printGlobalOfEmployees() {
		System.out.println();
		System.out.println("***********START OF GLOBAL EMPLOYEES LIST***********");
		for (int i = 0; i < globalCount; i++) {
			System.out.println((i+1) +". "+ allEmployees[i]);
			
		}
	
		
		System.out.println("***********END OF GLOBAL EMPLOYEES LIST***********");
		
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
