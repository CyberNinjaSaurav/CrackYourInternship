package CrackYourInternship.Day7;

import java.util.ArrayDeque;
import java.util.Deque;

public class Max_Value_of_Equation {

       public int findMaxValueOfEquation(int[][] points, int k) {

        Deque<Pair<Integer, Integer>> dq = new ArrayDeque<>();
        int res = Integer.MIN_VALUE;

        for(int[] point : points){
            while(!dq.isEmpty() && point[0] - dq.peekFirst().getValue() > k){
                dq.pollFirst();
            }
            if(!dq.isEmpty()){
                res = Math.max(res, dq.peekFirst().getKey() + point[0] + point[1]);
            }
            while(!dq.isEmpty() && point[1] - point[0] > dq.peekLast().getKey()){
                dq.pollLast();
            }
            dq.offerLast(new Pair<>(point[1] - point[0], point[0]));
        }
        return res;
        
    }
    
}
