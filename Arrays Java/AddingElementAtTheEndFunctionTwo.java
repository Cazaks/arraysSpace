import java.util.Arrays;

public class AddingElementAtTheEndFunctionTwo{

	public static int[] addingElementAtTheEnd(int[] arrays, int number){
		int [] newArrays = new int [arrays.length + 1];

		for(int count = 0; count < arrays.length; count++){
			newArrays[count] = arrays[count];
		}

		newArrays[newArrays.length - 1] = number;
		return newArrays;
	}

	public static void main(String[]args){
		int [] result = {6, 3, 8, 2, 5, 1};

		System.out.println(Arrays.toString(AddingElementAtTheEndFunctionTwo.addingElementAtTheEnd(result,7)));
	}	

}