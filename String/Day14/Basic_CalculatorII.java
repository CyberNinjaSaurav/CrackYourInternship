package CrackYourInternship.String.Day14;

import java.util.Stack;

public class Basic_CalculatorII {

    public int calculate(String s) {
              Stack <Integer> stack = new Stack<>();
              int result = 0;
              int number = 0;
              char sign = '+';

              for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);

                if(Character.isDigit(c)){
                    number = number * 10 + (c - '0');
                }
                if((!Character.isDigit(c) && !Character.isWhitespace(c)) || i == s.length() -1){
                    if (sign == '+'){
                        stack.push(number);
                    }
                    else if(sign == '-'){
                        stack.push(-number);
                    }
                    else if(sign == '*'){
                        stack.push(stack.pop() * number);
                    }
                    else if(sign == '/'){
                        stack.push(stack.pop() / number);
                    }
                    sign = c;
                    number = 0;
                }
              }
              
              while (!stack.isEmpty()){
                result += stack.pop();
              }
              return result;

    }
    
}
