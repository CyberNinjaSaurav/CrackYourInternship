package CrackYourInternship.Day7;

import java.util.*;

public class Majority_Element {
    public int majorityElement(int [] nums){
    int n = nums.length;
    Map<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < nums.length; i++){
        map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
    }
    for(int i = 0; i < map.size(); i++){
        int key = (int) map.keySet().toArray()[i];
        if(map.get(key) > n/2){
            return key;
        }
    }
   return -1;
    
}
}
