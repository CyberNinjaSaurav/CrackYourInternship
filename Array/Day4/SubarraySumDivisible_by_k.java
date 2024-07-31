package CrackYourInternship.Day4;

import java.util.HashMap;

public class SubarraySumDivisible_by_k {
     public int subarraysDivByK(int[] arr, int k) {
 HashMap<Integer,Integer> map = new HashMap<>();
      

        int sum = 0;
        int ans = 0;
        int n = arr.length;
        map.put(0,1);
        for(int i=0; i<n; i++){
            sum = (sum+arr[i])%k;
            
            if(sum<0) 
                sum+=k;
            
            ans += map.getOrDefault(sum, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return ans;

        
    }
}
    

