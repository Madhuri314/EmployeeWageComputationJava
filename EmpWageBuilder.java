public class EmpWageBuilderUC5{
	//Constants
        public static final int isPartTime=1;
        public static final int isFullTime=2;
        public static final int EMP_RATE_PER_HR=20;
        public static final int NUM_OF_WORKING_DAYS=20;

        public static void main(String args[]){
		//Variables
                int empHours=0;
                int empWagesPerDay=0;
                int totalEmpWage=0;

                for(int day=1;day<NUM_OF_WORKING_DAYS;day++){
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
			//Computation
                        empWagesPerDay=empHours*EMP_RATE_PER_HR;
                        totalEmpWage+=empWagesPerDay;

                }

                System.out.println("Monthly salary of employee: "+totalEmpWage);
        }
}
