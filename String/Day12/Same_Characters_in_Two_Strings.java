package CrackYourInternship.String.Day12;

public class Same_Characters_in_Two_Strings {
    int sameChar(String A, String B) 
    {
       
        int count = 0;
        
        String A1 = A.toLowerCase();
        String B1 = B.toLowerCase();
        
        for(int i = 0; i < A1.length(); i++){
            if(A1.charAt(i) == B1.charAt(i)){
                count++;
            }
        }
        return count;
    }
    
}
