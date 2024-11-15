package dummy;

public class Test_script_1 {

	    public static void main(String[] args) {
	        // Added a new test case for login functionality
	        System.out.println("Testing Login Functionality...");
	        // Simulate login test
	        boolean loginSuccessful = testLogin("testUser", "password123");
	        if (loginSuccessful) {
	            System.out.println("Login test passed!");
	        } else {
	            System.out.println("Login test failed.");
	        }
	    }

	    public static boolean testLogin(String username, String password) {
	        // Simulate login logic here
	        return username.equals("testUser") && password.equals("password123");
	    }
	}


