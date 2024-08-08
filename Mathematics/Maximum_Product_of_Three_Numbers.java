package CrackYourInternship.Mathematics;

import java.util.Arrays;

public class Maximum_Product_of_Three_Numbers {

    public int maximumProduct(int[] nums) {

      
       Arrays.sort(nums);
       int  pro1 = nums[0] * nums[1] * nums[nums.length -1];
       int pro2 = nums[nums.length-1] * nums[nums.length -2] * nums[nums.length-3];
           
           int maxPro = Integer.max(pro1, pro2);
           return maxPro;

    }
    
}
