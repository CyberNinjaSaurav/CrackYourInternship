public class MoveZeros {
    public void moveZeroes(int[] nums){
        int size = nums.length;
        if(size == 0 || size == 1){
            return;
        }
        int left = 0, right = 0;
        while(left < size){
            if(nums[left] != 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right++;
            }else{
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        
        new MoveZeros().moveZeroes(nums);
        for(int num : nums)
        System.out.print(num+" ");


        
    }
    
}
