public class Leetcode_383 {

    public static boolean canConstruct(String ransomNote, String magazine) {
        
        char [] ransomNoteA = createArray(ransomNote);
        char [] magazineA = createArray(magazine);

        for (int index = 0; index < ransomNoteA.length; index++) {

            System.out.println("Processing Ransom Note character: " + ransomNoteA[index]);

            if (checkAndUpdateMagazine(ransomNoteA[index], magazineA)) {
                continue;
            } else {
                System.out.println("No Match. Aborting check");
                return false;
            }
        }
        return true;
    }

    public static char [] createArray(String inputString) {

        char[] carray = new char[inputString.length()];

        for (int i = 0; i < inputString.length(); i++) {
            carray[i] = inputString.charAt(i);
        }

        return carray;
    }

    public static boolean checkAndUpdateMagazine(char c, char [] magazineA) {

        boolean result = false;
        for (int index = 0; index < magazineA.length; index++) {
            if (magazineA[index] != c) {
                continue;
            } else {
                magazineA[index] = '-';
                result = true;
                break;
            }
        }

        System.out.println("checkAndUpdateMagazine result: " + result);
        return result;
    }

    public static void main(String [ ] args){   

        boolean present = canConstruct("aa", "aab");
        
        if(present == true){
            System.out.println("Ransom Note is accurate");
        } else {
            System.out.println("Ransom Note is not using dictionary");
        }

    }
}