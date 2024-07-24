

import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> out = new ArrayList<>();
        Arrays.sort(nums);

        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
                else if (sum > 0){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        out.addAll(set);
        return out;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};  // Directly initialize the input array
        List<List<Integer>> result = threeSum(nums);
        System.out.println("Output: " + result);
    }
}
