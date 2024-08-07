package CrackYourInternship.Mathematics;

public class Minimum Moves_to_Equal_Array_Elements_II {

    public int minMoves2(int[] nums) {

        Arrays.sort(nums);
       int start = 0;
        int end = nums.length -1;
         int count = 0;

        while(start < end){
            count += (nums[end] - nums[start]);
            start++;
            end--;
        }
       return count;


    }
    
}
