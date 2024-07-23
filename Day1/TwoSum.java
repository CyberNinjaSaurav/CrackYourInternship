package Day1;

import java.util.HashMap;

public class TwoSum {


    public int []twoSum(int[] nums, int target){
       
        HashMap<Integer, Integer> hash = new HashMap<>();

        for(int  i = 0; i < nums.length; i++){

            int rem = target - nums[i];
            if(hash.containsKey(rem)){
                int arr[] = {hash.get(rem), i};
                return arr;
            }
            hash.put(nums[i], i);
        }
        return null;

    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = new TwoSum().twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        
    }
    
}
