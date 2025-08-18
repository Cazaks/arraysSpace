import java.util.Arrays;

public class CountingEvenNumbers{
	public static void main(String[]args){

		int[] numbers = {9, 8, 7, 6, 5, 4, 3, 2, 1, 10};
		//int[] evenNumbers = new int[numbers.length];
		int evenNumbers = 0;

		for(int index = 0; index < numbers.length; index++){
			if(index % 2 == 0){
				evenNumbers++;
			}	
		}

		System.out.println(evenNumbers);		
	}
}