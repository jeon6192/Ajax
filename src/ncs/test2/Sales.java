package ncs.test2;

public class Sales extends Employee implements Bonus{
	public Sales() {
		super();
	}
	public Sales(String name,int number,String department,int salary) {
		super(name, number, department, salary);
	}
	
	@Override
	public double tax() {
		double tax=this.getSalary()*0.13;
		return tax;
	}	
	@Override
	public void incentive(int pay) {
		int sal=0;
		sal=(int) (this.getSalary()+(pay*1.2));
		setSalary(sal);
	}
	
}
