package Day1;

import java.util.HashMap;

public class TwoSum {


    public int []twoSum(int[] nums, int target){
        int n = nums.length;
       
         HashMap<Integer, Integer> hash = new HashMap<>();
         
         for(int i = 0; i < n; i++){
            int rem = target - nums[i];
            if(hash.containsKey(rem)){
                return new int[]{hash.get(rem), i};
            }
            hash.put(nums[i], i);
         }
        
           return new int[]{};




    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = new TwoSum().twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        
    }
    
}
