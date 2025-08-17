import java.util.Arrays;

public class AddingElementAtTheEndFunction{

	public static int[] addingElementAtTheEnd(int[] numbers){
		int[] newNumbers = new int[numbers.length + 1];

		for(int count = 0; count < numbers.length; count++){
			newNumbers[count] = numbers[count];	
		}
		
		newNumbers[newNumbers.length - 1] = 8;
		return newNumbers; 
	}

	public static void main(String[]args){
		int[] result = {3, 7, 9, 4};
		System.out.println(Arrays.toString(AddingElementAtTheEndFunction.addingElementAtTheEnd(result)));
	}	
}