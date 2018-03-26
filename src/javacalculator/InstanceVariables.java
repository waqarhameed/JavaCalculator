package javacalculator;

public class InstanceVariables {
	public String name;
	   
	private double salary;
	
	public InstanceVariables(String empName) {
		      name = empName;
		   }
	   public void setSalary(double empSal) {
		      salary = empSal;
		   }
	   public void printEmp() {
		      System.out.println("name  : " + name );
		      System.out.println("salary :" + salary);
		   }
	
	public static void main(String[] args) {
		InstanceVariables empOne = new InstanceVariables("Ransika");
	      empOne.setSalary(1000);
	      empOne.printEmp();
	}
	
}
