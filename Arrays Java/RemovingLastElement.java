import java.util.Arrays;

public class RemovingLastElement{
	public static void main(String[]args){

		int[] numbers = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		int[] newNumbers = new int[numbers.length - 1];
		
		for(int index = 1; index < numbers.length; index++){
		newNumbers[index - 1] = numbers[index];	
		}

		System.out.print(Arrays.toString(newNumbers));		
	}
}