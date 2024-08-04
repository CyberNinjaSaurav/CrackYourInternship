package CrackYourInternship.String.Day13;

import java.util.HashMap;

public class Smallest_Window_in_a_string {


      public static String smallestWindow(String s, String p)
    {
       
        
        int n = s.length();
        int m = p.length();
        
             HashMap<Character, Integer> map = new HashMap<>();
     
             
             for(int k = 0; k < m; k++){
                 map.put(p.charAt(k), map.getOrDefault(p.charAt(k), 0) + 1);
                 
             }
             
             int i = 0, j = 0;
             String ans = "-1";
             int count = map.size();
             int len   = Integer.MAX_VALUE;
             
             while( j < n){
                 if(map.get(s.charAt(j)) != null){
                     map.put(s.charAt(j),  map.get(s.charAt(j)) -1);
                     
                     if(map.get(s.charAt(j)) == 0){
                         count--;
                     }
                 }
          
                 
                 if(count == 0){
                     while(count == 0){
                         if(len > (j - i + 1)){
                             len = (j - i + 1);
                             ans = s.substring(i , j + 1);
                         }
                       
                         
                         if(map.get(s.charAt(i))  != null){
                             map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                             
                             if(map.get(s.charAt(i)) > 0){
                                 count++;
                             }
                         }
                         i++;
                     }
                 }
                 j++;
             }
             return ans;
    
}
