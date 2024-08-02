package CrackYourInternship.String.Day11;
import java.util.*;

public class Generate_Parentheses {

    public List<String> generateParentheses(int n){
         
    List<String> res = new ArrayList<>();
        recursive(res, 0, 0, "", n);
        return res;
    }
    public void recursive(List<String> res, int left, int right, String s, int n){
        if(s.length() == n * 2){
            res.add(s);
            return;
        }
        if(left < n){
            recursive(res, left + 1, right, s + "(", n);
        }
        if(right < left){
            recursive(res, left, right + 1, s + ")", n);
        }
    }
   

}
