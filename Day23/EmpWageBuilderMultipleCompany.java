public class EmpWageBuilderMultipleCompany {
        private String companyName;
        private int empRate;
        private int numberofWorkingDays;
        private int maxHrsInMonth;
        private int totalEmpWage;

        /**
        *instance variables initialized
        */
        public EmpWageBuilderMultipleCompany(final String companyName,final int empRate, final int numberofWorkingDays,final int maxHrsInMonth) {
                this.companyName=companyName;
                this.empRate=empRate;
                this.numberofWorkingDays=numberofWorkingDays;
                this.maxHrsInMonth=maxHrsInMonth;
        }

        public static void main(String args[]) {
                final EmpWageBuilderMultipleCompany ewbObj1= new EmpWageBuilderMultipleCompany("TATA", 20, 20, 100);
                ewbObj1.computeEmpWage();
                System.out.println(ewbObj1);

                final EmpWageBuilderMultipleCompany ewbObj2= new EmpWageBuilderMultipleCompany("BATA", 15, 25, 100);
                ewbObj2.computeEmpWage();
                System.out.println(ewbObj2);

        }

        /**
	*@return totalWage
	*/
    	public void computeEmpWage() {
                int totalWage=0;
                int totalEmpHrs=0;
                int totalWorkingDays=0;

                while(totalEmpHrs<maxHrsInMonth && totalWorkingDays<numberofWorkingDays) {
                        totalWorkingDays++;

                        final int empHrs=getEmpHrs();
                        final int empWage=empHrs*empRate;
                        totalEmpHrs=empHrs;
                        totalWage+=empWage;
                }
                totalEmpWage=totalWage;
        }

        /**
        *get employee hours
        *@return employee hrs
        */
        public int getEmpHrs() {
                final int isFullTime=1;
                final int isPartTime=2;
                int empHrs=0;

                //get random value
                final double randomValue=Math.floor(Math.random()*10)%3;

                switch((int)randomValue) {
                        case isFullTime:
                 empHrs = 8;
                 break;
         case isPartTime:
                 empHrs = 4;
                 break;
         default:
                 empHrs = 0;
                 break;
                }
                return empHrs;
        }

        /**
        *@override
        */
        public String toString() {
                return "Total employee wage for company "+companyName+" is  "+totalEmpWage;
        }
}
