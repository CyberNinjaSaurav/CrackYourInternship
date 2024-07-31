package CrackYourInternship.Day7;

public class Jump_Games {
    public boolean canJump(int[] nums) {

        int targetNumber = nums.length -1;
        for(int i = targetNumber -2; i>= 0; i--){
            if(targetNumber <= i + nums[i]){
                targetNumber = i;
            }

        }
        return targetNumber == 0;
        
    }
    
}
