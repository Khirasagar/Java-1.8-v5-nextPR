package in.java8.streams;

public class DuplicateClass {
	 
	public static void main(String[] args) {
		int arr[] = {12, 22, 22, 45, 12, 45, 7};
		int n = arr.length;
		
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	System.out.println("++++++++++++++++++");

		// Outer loop picks each element one by one
		for (int i = 0; i < n; i++) {
			// Inner loop checks for duplicates
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					// Shift elements left to remove the duplicate
					for (int k = j; k < n - 1; k++) {
						arr[k] = arr[k + 1];
					}
					n--;  // Reduce the array size as a duplicate is removed
					j--;  // Check the current index again after shifting
				}
			}
		}

		// Print the array after removing duplicates
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}
}
