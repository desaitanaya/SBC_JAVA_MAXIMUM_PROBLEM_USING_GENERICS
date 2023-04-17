public class Find_Maximum {

	public static void toPrintMaxInteger(Integer[] inputArray) {
		System.out.println("ELEMENTS IN ARRAY : ");
		for (int element : inputArray) {
			System.out.printf("%s", element);
			System.out.println();
		}
		System.out.println();

		int x;
		int max = inputArray[0];
		System.out.println("MAXIMUM ELEMENT IN ARRAY : ");
		for (int i = 1; i < inputArray.length; i++) {
			/*
			 * Using compareTo method to find maximum among integer values in array
			 */
			if ((inputArray[i].compareTo(max)) > 0) {
				max = inputArray[i];
			}
		}
		System.out.println(max);
		System.out.println("---------------------------------------------------------");
	}

	public static void toPrintMaxDouble(Double[] inputArray) {
		System.out.println("ELEMENTS IN ARRAY : ");
		for (double element : inputArray) {
			System.out.printf("%s", element);
			System.out.println();
		}
		System.out.println();

		int x;
		double max = inputArray[0];
		System.out.println("MAXIMUM ELEMENT IN ARRAY : ");
		for (int i = 1; i < inputArray.length; i++) {
			/*
			 * Using compareTo method 
			 * to find maximum 
			 * among float values 
			 * in array
			 */
			if ((inputArray[i].compareTo(max)) > 0) {
				max = inputArray[i];
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		System.out.println();
		System.out.println("WELCOME TO FIND MAXIMUM PROBLEM USING GENERICS PROGRAM");
		System.out.println("---------------------------------------------------------");

		// Integer array
		Integer[] intarr = { 10, 35, 41, 2, 6 };
		Find_Maximum.toPrintMaxInteger(intarr);

		//Double array
		Double[] doublearr = { 12.4, 54.3, 64.0, 2.4, 25.7 };
		Find_Maximum.toPrintMaxDouble(doublearr);
	}

}