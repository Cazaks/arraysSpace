import java.util.Arrays;

public class DisplayPositiveNumbers{
	public static void main(String[]args){

		int[] numbers = {9, -8, 7, -88, 6, -3, 2, 1, - 7, -10, 5};
		//int positiveNumbers = 0;

		for(int index = 0; index < numbers.length; index++){
			if(numbers[index] > 0){
			System.out.print(numbers[index] + " ");
			}			
		}

		//System.out.println(Arrays.toString(numbers));		
	}
}