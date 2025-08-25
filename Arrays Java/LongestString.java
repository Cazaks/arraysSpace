import java.util.Arrays;
public class LongestString{
	public static String[] findLongestString(String[] words){
	
		String longestWord = words [0];
		for(int index = 0; index < words.length; index++){
		if(words[index].length() > longestWord.length()){
			longestWord = words[index];
			}
		} 
		return new String[] {longestWord};
	}
	
	public static void main(String[] args){
		String[] wordList = {"environment", "compounded", "vehicle", "housing"};
		//String[] outPut = findLongestString(wordList); 

		System.out.println("The longest word in the array is: " + Arrays.toString(LongestString.findLongestString(wordList)));
	}
}