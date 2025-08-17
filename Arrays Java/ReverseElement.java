import java.util.Arrays;

public class ReverseElement{
	public static void main(String[]args){

		int[] numbers = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		int[] reverse = new int[numbers.length];
		
		for(int index = numbers.length - 1; index >= 0; index--){
		reverse[numbers.length - 1 - index] = numbers[index];	
		}

		System.out.print(Arrays.toString(reverse));		
	}
}