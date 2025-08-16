import java.util.Arrays;

public class ReplaceSecondElementUsingLoop {
    public static void main(String[] args) {

        int[] values = {5, 8, 1, 4, 11, 6, 3};

        for (int count = 0; count < values.length; count++) {
        	if(count == 1){
			values[count] = 2;
		}
        }

	 System.out.print(Arrays.toString(values));
        
    }
}
