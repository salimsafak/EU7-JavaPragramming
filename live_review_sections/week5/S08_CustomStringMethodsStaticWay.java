package week5;

public class S08_CustomStringMethodsStaticWay {

	public static void main(String[] args) {
	
		
		System.out.println("Frequency of my character: " + frequency("aabcccd",'e'));
		
		
	}

	public static int frequency(String string, char c) {  // our base methods for coming tasks
		
		int count = 0;  // dummy variable that holds my counter
		// algorithm
		// first check if the string contains or not: return error
		// iterate throughout the whole string and check how many that char is in there
		// we get each char with charAt(i) method
//		if (!string.contains(""+c)) {
//			count = -1;
//			return count;
//		}

		for (int i =0; i<string.length(); i++) {
				
				if(string.charAt(i) == c) {
					count++;
				}
			}
		
		return count;
	}
	
	
	
	
}