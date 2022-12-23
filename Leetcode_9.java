public class Leetcode_9 {
    public static boolean isPalindrome(int x) {
        
        
        String strx = Integer.toString(x);
		int size = strx.length();
		size = size - 1;

		for ( int currentln = 0; currentln <= size; size-- , currentln++ ) { 
			char currentls = strx.charAt(currentln);
			char currentle = strx.charAt(size);

			if (currentls == currentle) {
				continue;
			}
			else if (currentls != currentle) {
				return false;
					
			}	
		}			
		return true;
    }

    public static void main(String [ ] args){

    	//enter what ever number you would like to check below
    	if(isPalindrome(100) == true){
    		System.out.println("The number is a palindrome!");
    	}
    	else{
    		System.out.println("The number is not a palindrome!");
    	}
    }
}