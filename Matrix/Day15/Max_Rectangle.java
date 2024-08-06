package CrackYourInternship.Matrix.Day15;

import java.util.Stack;

public class Max_Rectangle{
     
    public int mah(int arr[],int n){
        int res = 0;
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i <= n; i++) {
            while (!stk.isEmpty() && (i == n || arr[i] <= arr[stk.peek()])) {
                int height = arr[stk.pop()];
                int width;
                if (stk.isEmpty()) {
                    width = i;
                } else {
                    width = i - stk.peek() - 1;
                }
                res = Math.max(res, height * width);
            }
            stk.push(i);
        }
        return res;
    }
    public int maxArea(int M[][], int n, int m) {
        // add code here.
        int temp[]=new int[m];
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(M[i][j]==0){
                    temp[j]=0;
                }
                else{
                  temp[j]=M[i][j]+temp[j];  
                }
                
            }
            max=Math.max(mah(temp,m),max);
        }
        return max;
    }
}