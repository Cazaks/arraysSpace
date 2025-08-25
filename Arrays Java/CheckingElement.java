import java.util.Arrays;
public class CheckingElement{
	public static boolean isElemenetPresent(int[] element, int checking){
		
		for(int check = 0; check < element.length; check++){
			if(element[check] == checking){
				return true;
			}
		}
			return false;
	}
	
	public static void main(String[] args){
		int[] result = {7, 9, 0, 6, 3, 1};
		int number = 8;

		boolean found = isElemenetPresent(result, number);

		if(found){
			System.out.println(number + " is present in " + Arrays.toString(result));
		}
		else{
			System.out.println(number + " is not present in " + Arrays.toString(result));
		}
	}
}