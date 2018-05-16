package ncs.test2;

public class Company {
	public static void main(String[] args) {
		Employee[] employees=new Employee[2];
		Secretary secretary=new Secretary("Hilery", 1, "secretary", 800);
		Sales sales=new Sales("Clinten", 2, "sales", 1200);
		employees[0]=secretary;
		employees[1]=sales;
		
		System.out.println("name\tdepartment\tsalary");
		System.out.println("-------------------------------------");
		for(Employee obj:employees) {
			System.out.print(obj.getName()+"\t");
			System.out.print(obj.getDepartment()+"\t");
			if(obj.getDepartment().length()<=8)	System.out.print("\t");
			System.out.println(obj.getSalary());
		}
		
		System.out.println("\n인센티브 100 지급\n");
		secretary.incentive(100);
		sales.incentive(100);
		
		System.out.println("name\tdepartment\tsalary\ttax");
		System.out.println("------------------------------------------");
		for(Employee obj:employees) {
			System.out.print(obj.getName()+"\t");
			System.out.print(obj.getDepartment()+"\t");
			if(obj.getDepartment().length()<=8)	System.out.print("\t");
			System.out.print(obj.getSalary()+"\t");
			System.out.println(obj.tax());
		}
	}

}
