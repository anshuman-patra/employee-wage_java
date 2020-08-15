public class EmployeeWage
{ public static final int EMP_RATE_PER_HOUR=20;
                public static final int NUMBER_WORKING_DAYS=20;

	public static void main(String[] args)
	{
		System.out.println("Welcome to employee wage problem");
		int  totalSalary=0;
		int empHrs=0;
                int empWage=0;
                int wagePerHour=20;
		for(int i=0; i<NUMBER_WORKING_DAYS; i++)
		{ 
		int randomCheck=(int) (Math.random()*10)%3;
		switch(randomCheck)
		     {

		case 1:
		          
			System.out.println("Employee is present");
			empHrs=8;
			      break;
				
              case 2:
		  System.out.println("Employee is part time");
			empHrs=4;
				break;
		

		 default:
		
			System.out.println("Employee is absent");
				empHrs=0;
				break;
			}

			empWage=EMP_RATE_PER_HOUR*empHrs;
			System.out.println("Employee daily wage:" + empWage);
			totalSalary=totalSalary+empWage;
		}
		System.out.println("Total employee wage:" + totalSalary);
	}
}
