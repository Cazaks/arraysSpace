import java.util.Arrays;

public class FirstNumberGreaterThanFive{
	public static void main(String[]args){

		int[] numbers = {5, 4, 3, 2, 1, 7};
		boolean found = false;
		int index;

		for(index = 0; index < numbers.length; index++){
			if(numbers[index] > 5){
				found = true;
				//System.out.println("The first number greater five is:" + numbers[index]);
				break;
			}				
		}

		//if(!found){
			//System.out.println("No number greater than 5 was found in the array.");
		//}
		
		if(found == true){
			System.out.println("The first number greater five is:" + numbers[index]);
		}
		else{
			System.out.println("No number greater than 5 was found in the array.");
		}		
	}
}