package javaAssignments;

class EmployeeData
{
   private int empID;
   private String empName;
   private int empAge;
   EmployeeData()
   {
       //Default constructor
	   empID = 101;
	   empName = "Mallikarjun";
	   empAge = 30;
   }
   EmployeeData(int num1, String str, int num2)
   {
       //Parameterized constructor
	   empID = num1;
	   empName = str;
	   empAge = num2;
   }
   //Getter and setter methods
   public int getempID() {
       return empID;
   }
   public void setStuID(int empID) {
       this.empID = empID;
   }
   public String getempName() {
       return empName;
   }
   public void setStuName(String empName) {
       this.empName = empName;
   }
   public int getempAge() {
       return empAge;
   }
   public void setStuAge(int stuAge) {
       this.empAge = empAge;
   }

   public static void main(String args[])
   {
       //This object creation would call the default constructor
	   EmployeeData myobj = new EmployeeData();
       System.out.println("Employee Name is: "+myobj.getempName());
       System.out.println("Employee Age is: "+myobj.getempAge());
       System.out.println("Employee ID is: "+myobj.getempID());

       /*This object creation would call the parameterized
        * constructor StudentData(int, String, int)*/
       EmployeeData myobj2 = new EmployeeData(555, "Chaitanya", 25);
       System.out.println("Employee Name is: "+myobj2.getempName());
       System.out.println("Employee Age is: "+myobj2.getempAge());
       System.out.println("Employee ID is: "+myobj2.getempID()); 
  }
}
