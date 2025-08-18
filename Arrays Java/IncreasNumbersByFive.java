import java.util.Arrays;

public class IncreasNumbersByFive{
	public static void main(String[]args){

		int[] numbers = {9, 8, 7, 6, 5, 4, 3, 2, 1, 10};

		for(int index = 0; index < numbers.length; index++){
			numbers[index]+=5;			
		}

		System.out.println(Arrays.toString(numbers));		
	}
}