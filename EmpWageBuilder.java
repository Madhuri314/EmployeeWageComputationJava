public class EmpWageBuilder{
        public static final int isPresent=1;

        public static void main(String args[]){
               double randomCheck=Math.floor(Math.random()*10)%2;

                if(randomCheck==isPresent){
                        System.out.println("Employee is present");
                }
                else{
                        System.out.println("Employee is absent");
                }
        }
}
