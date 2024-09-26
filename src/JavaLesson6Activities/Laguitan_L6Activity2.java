package JavaLesson6Activities;

public class Laguitan_L6Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] employeeList = {7, 7, 8, 9, 5, 10};
		final int targetHours = 8;
		
		System.out.print("Total Employees who have met the target: " + 
				printNoOfEmployees(employeeList, targetHours));
	}
	
	/**
	 * Function name: printNoOfEmployees
	 * Parameters:
	 * 	1. int array employeeList - array of number of hours worked by employees
	 * 	2. int targetHours - target number of hours employees should take
	 * 
	 * Inside the function:
	 * 	1. Traverses the given array 
	 *  2. Count increases when finding employees who worked 8 hours or more
	 *  3. returns count of employees who worked 8 hours or more
	 *  
	 * Returns:
	 *  1. int count of employees who have worked 8 hours or more  
	 */
	public static int printNoOfEmployees(int[] employeeList, int targetHours) {
		int temp = 0;
		for(int i = 0; i < employeeList.length; i++) {
			if (employeeList[i] >= targetHours ) {
				temp++;
			}
		}
		return temp;
	}

}
