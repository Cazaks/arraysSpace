import java.util.Arrays;

public class AddingElementAtTheEnd{
	public static void main(String[]args){

		int[] numbers = {3, 8, 2, 4};
		int[] newNumbers = new int[numbers.length + 1];

		for(int count = 0; count < numbers.length; count++){
		newNumbers[count] = numbers[count];
		}

		newNumbers[newNumbers.length - 1] = 1;

		System.out.println(Arrays.toString(newNumbers));


}
}