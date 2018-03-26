package javacalculator;
class EmployeeCount
{
   private int numOfEmployees = 0;
   public void NoOfEmployees (int count)
   {
       numOfEmployees = count;
   }
   public int NoOfEmployees () 
   {
       return numOfEmployees;
   }
}
public class EncapsulationExample
{
   public static void main(String args[])
   {
      EmployeeCount obj = new EmployeeCount ();
      obj.NoOfEmployees(5613);
      System.out.println("No Of Employees: "+(int)obj.NoOfEmployees());
    }
}