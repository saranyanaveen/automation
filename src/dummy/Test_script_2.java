package dummy;

public class Test_script_2 {
	public static void main(String[] args) {
        // Improved error handling
        System.out.println("Testing Error Handling in Automation...");
        try {
            int result = divide(10, 0);
            System.out.println("Division result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}


