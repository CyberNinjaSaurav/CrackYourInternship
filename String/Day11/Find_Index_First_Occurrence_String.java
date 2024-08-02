package CrackYourInternship.String.Day11;

public class Find_Index_First_Occurrence_String {
    
    public int strStr(String haystack, String needle){
        
        int left = haystack.length();
        int right = needle.length();

        if(left < right){
            return -1;
        }
        for(int i = 0; i <= left - right; i++){
            if(haystack.substring(i, i + right).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
