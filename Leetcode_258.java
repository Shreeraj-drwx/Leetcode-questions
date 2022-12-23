import java.util.Arrays;

public class Leetcode_258{

	public static void main(String [ ] args){

		int num = 37;
		while(num >= 10){
			num = addDigits(num);
		}
		System.out.println(num);

	}

	public static int addDigits(int num ) {

		int sum = 0;
		String strnum = Integer.toString(num);
        int[] digitArray = new int[strnum.length()];

        for (int i = 0; i < strnum.length(); i++) {
            digitArray[i] = Character.getNumericValue(strnum.charAt(i));
        }
        System.out.println("Contents of array: " + Arrays.toString(digitArray));
       
		for(int i2 = 0; i2 < strnum.length(); i2++){
			sum = sum + digitArray[i2];
	        	 
		}   
		num = sum;

		return num;     
	}
}