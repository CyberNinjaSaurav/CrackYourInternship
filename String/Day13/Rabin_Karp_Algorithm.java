package CrackYourInternship.String.Day13;
import java.util.*;

import java.util.ArrayList;

public class Rabin_Karp_Algorithm {
    
     ArrayList<Integer> search(String pattern, String text)
    {
        // your code here
        
  ArrayList<Integer> list = new ArrayList<Integer>();
        
        int textLength = text.length();
        int patternLength = pattern.length();
        
        for(int i=0; i<=textLength-patternLength; i++){
            if(text.substring(i, i+patternLength).equals(pattern)){
               list.add(i+1);
            }
        }
        return list;
    }
    
}
