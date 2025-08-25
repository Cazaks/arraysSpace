import java.util.Arrays;
public class EvenNumbers{
	public static int[] checkEvenNumbers(int[] arrays){
	
		int evenCount = 0;
		for(int index = 0; index < arrays.length; index++){
			if(arrays[index] % 2 == 0){
				evenCount++;
			}
		}
		
		int[] evenNumbers = new int[evenCount];
		int count = 0;

		for(int index = 0; index < arrays.length; index++){
			if(arrays[index] % 2 == 0){
				evenNumbers[count] = arrays[index];
				count++;
			}
		}

		return evenNumbers;
	}
		

	public static void main(String[]args){
	
		int[] outPut = {4, 7, 8, 5, 6, 9, 4, 2, 1, 10, 3};
		System.out.println("The even numbers in the arrays are: " + Arrays.toString(EvenNumbers.checkEvenNumbers(outPut)));	
	}		
}