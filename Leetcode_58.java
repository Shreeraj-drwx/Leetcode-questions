public class Leetcode_58 {
    public static int lengthOfLastWord(String s) {
        
        boolean complete = false;
        int length = 0;
        char[] sentA = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
        sentA[i] = s.charAt(i);
        }

        int i = sentA.length - 1 ;
        while(complete == false){
            if(sentA[i] == ' '){
                i--;
                continue;
            }
            else{
                length++;
                if(sentA.length == 1){
                    complete = true;   
                }
                else if(i == 0){
                    complete = true;
                }
                else if(sentA[i-1] == ' '){
                    complete = true;
                }
                i--;
                continue;    
            }
        }  
        return length;
    }
    public static void main(String [ ] args){
        int length = lengthOfLastWord("Hello world  ");
        System.out.println(length);
    }    
}