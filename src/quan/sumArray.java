package quan;

public class sumArray {

	public static void main(String[] args) {
		int[] myArray = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		
		for (int element : myArray) {
			sum += element;
			
		}
		
		System.out.println("The sum is " + sum);
	}

}
