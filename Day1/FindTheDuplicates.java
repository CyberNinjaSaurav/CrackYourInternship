package Day1;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicates {
      static  int findDuplicate(int[] nums) {
      
      Set<Integer> set = new HashSet();
      for(int i = 0; i < nums.length; i++){
        if(set.contains(nums[i]))
        return nums[i];
        set.add(nums[i]);
      }
      return -1;
        
    }
    public static void main(String[] args) {
       
        int[] nums = {1,3,4,2,2};
        int duplicate = findDuplicate(nums);
        System.out.println("Duplicate found: " + duplicate);
       
    }
    
}
