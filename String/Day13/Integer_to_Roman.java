package CrackYourInternship.String.Day13;

public class Integer_to_Roman {

    public String intToRoman(int num) {

        int[] integerVal=new int[]      {1  ,4   ,5  ,9   ,10 ,40  ,50 ,90  ,100,400 ,500,900 ,1000};
             String[] strVal=new String[]{"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
 
             String str = "";
             for(int i = integerVal.length -1; i >= 0; i--){
                 while(num >= integerVal[i]){
                     str = str + strVal[i];
                     num = num - integerVal[i];
                 }
             }
             return str;
 
    
}
