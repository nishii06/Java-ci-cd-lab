public class CalculatorTest{
    public static void main(String args[]){
        Calculator cal=new Calculator();
        if(cal.add(2,3)==5){
            System.out.println("Test Passed");
        }
        else{
            System.out.println("Test Failed");
        }
    }

        public static void main(String args[]){
        Calculator cal=new Calculator();
        if(cal.sub(3,2)==1){
            System.out.println("Test Passed");
        }
        else{
            System.out.println("Test Failed");
        }
    }

        public static void main(String args[]){
        Calculator cal=new Calculator();
        if(cal.mul(2,3)==6){
            System.out.println("Test Passed");
        }
        else{
            System.out.println("Test Failed");
        }
    }

        public static void main(String args[]){
        Calculator cal=new Calculator();
        if(cal.div(6,3)==2){
            System.out.println("Test Passed");
        }
        else{
            System.out.println("Test Failed");
        }
    }
}