package CrackYourInternship.Day5;

import java.util.ArrayList;
import java.util.Collections;

public class ChocolateDistributionProblem {

    public long findMinDiff(ArrayList<Integer> a, int n, int m)
    {

        Collections.sort(a);
        long res = Long.MAX_VALUE;

        for (int i = 0; i < n - m + 1; i++) {
            int min = a.get(i);
            int max = a.get(i + m -1);
            res = (long) Math.min(res, max - min);

            
        }
        return res;
    }

    public static void main(String[] args) {
        ChocolateDistributionProblem cd = new ChocolateDistributionProblem();

         ArrayList<Integer> a = new ArrayList<>();
         a.add(3);
         a.add(4);
         a.add(1);
         a.add(9);
         a.add(56);
         a.add(7);
         a.add(9);
         a.add(12);

         int n = 8;
         int m = 5;
         System.out.println(cd.findMinDiff(a, n, m));
        
    }
    
}
