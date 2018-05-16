package ncs.test2;

public class Secretary extends Employee implements Bonus{
	public Secretary(){	
		super();
	}
	public Secretary(String name,int number,String department,int salary){
		super(name, number, department, salary);
	}
	
	@Override
	public double tax() {
		double tax=this.getSalary()*0.1;
		return tax;
	}	
	@Override
	public void incentive(int pay) {
		int sal=0;
		sal=(int) (this.getSalary()+(pay*0.8));
		setSalary(sal);
	}

}
