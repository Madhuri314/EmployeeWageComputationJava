public class EmpWageBuilder{
	//Constants
        public static final int isPartTime=1;
        public static final int isFullTime=2;
        public static final int EMP_RATE_PER_HR=20;
        public static final int NUM_OF_WORKING_DAYS=20;
        public static final int maxHour=100;

        public static void main(String args[]){
		//Variables
                int empHours=0;
                int totalEmpHour=0;
                int totalWorkingDays=0;
                int totalEmpWage=0;

                while(totalEmpHour <= maxHour && totalWorkingDays < NUM_OF_WORKING_DAYS){
                        totalWorkingDays++;
			//random method
                        int randomCheck=(int)Math.floor(Math.random()*10)%3;

                        switch(randomCheck){
                                case isFullTime:
                                        System.out.println("Employee is fulltime present");
                                        empHours=8;
                                        break;
                                case isPartTime:
                                        System.out.println("Employee is present parttime");
                                        empHours=4;
                                        break;
                                default:
                                        System.out.println("Employee is absent");
                                        empHours=0;
                                        break;
                        }
			//computation
                        totalEmpHour+=empHours;
                        System.out.println("Day:"+totalWorkingDays+" Emp Hours:"+ empHours);
                }
		//computation
                totalEmpWage=totalEmpHour*EMP_RATE_PER_HR;
                System.out.println("Salary of employee: "+totalEmpWage);
        }
}
