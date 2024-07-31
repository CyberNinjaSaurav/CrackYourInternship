public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
  
        int count = 0;
      
       for (int i = 0; i < nums.length; i++){
           if ( i < nums.length-1 && nums[i] == nums[i+1])
           {
               continue;
           }
      
       else {
        nums[count] = nums[i];
        count++;
      
              
          }
          }
      
           return count;
      }

      public static void main(String[] args) {
        int[] nums = {1,1,2};
        RemoveDuplicates rd = new RemoveDuplicates();
        int newLength = rd.removeDuplicates(nums);

        for(int i = 0; i < newLength; i++){
            System.out.print(nums[i] + " ");
        }
        
      }
    
}
