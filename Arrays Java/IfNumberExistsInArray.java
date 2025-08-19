import java.util.Arrays;

public class IfNumberExistsInArray{
	public static void main(String[]args){

		int[] numbers = {9, 8, 7, 6, 5, 4, 3, 2, 1, 10};
		int targetNumber = 4;
		boolean found = false;

		for(int index = 0; index < numbers.length; index++){
			if(numbers[index] == targetNumber){
				found = true;
				break;
			}				
		}

		if(found == true){
			System.out.println(targetNumber + " exists in the array");
		}
		else{
			System.out.println(targetNumber + " dose not exists in the array");
		}		
	}
}