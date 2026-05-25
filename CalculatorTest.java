public class CalculatorTest {

    public static void main(String args[]) {

        Calculator cal = new Calculator();

        // Test Add
        if (cal.add(2, 3) == 5) {
            System.out.println("Add Test Passed");
        } else {
            System.out.println("Add Test Failed");
        }

        // Test Sub
        if (cal.sub(3, 2) == 1) {
            System.out.println("Sub Test Passed");
        } else {
            System.out.println("Sub Test Failed");
        }

        // Test Mul
        if (cal.mul(2, 3) == 6) {
            System.out.println("Mul Test Passed");
        } else {
            System.out.println("Mul Test Failed");
        }

        // Test Div
        if (cal.div(6, 3) == 2) {
            System.out.println("Div Test Passed");
        } else {
            System.out.println("Div Test Failed");
        }
    }
}