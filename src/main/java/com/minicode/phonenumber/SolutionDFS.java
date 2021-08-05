package com.minicode.phonenumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SolutionDFS {

    private static Map<Integer,String> map = new HashMap<>();
    private int index = 0;
    StringBuilder sb = new StringBuilder();
    List<String> result = new ArrayList<String>();
    static {
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
    }

    public List<String> letterCombinations(int[] digits) throws Exception {
        recursive(digits);
        return result;
    }

    public void recursive(int[] digits) throws Exception {
        int digit = digits[index];
        //digit has no mapping
        if(!hasmapping(digit)){
            //boundary
            if(index<digits.length-1){
                index++;
                recursive(digits);
            }else{
                result.add(sb.toString());
            }
        }else{
            char[] letters = this.convert(digit);
            for(int i=0 ; i<letters.length;i++){
                sb.append(letters[i]);
                //boundary
                if(index<digits.length-1){
                    index++;
                    recursive(digits);
                }else{
                    result.add(sb.toString());
                }
                sb.setLength(sb.length()-1);
            }
        }
        index--;
    }

    public char[] convert(int digit) throws Exception {
        char[] letter;
        if(digit<0 || digit > 99){
            throw new Exception("digit no mapping");
        }
        if(digit>9){
            int num1 = digit%10;
            int num2 = digit/10%10;
            if(hasmapping(num1)&&hasmapping(num2)){
                char[] letter1 =  map.get(num1).toCharArray();
                char[] letter2 = map.get(num2).toCharArray();
                letter = new char[letter1.length+letter2.length];
                System.arraycopy(letter1,0,letter,0,letter1.length);
                System.arraycopy(letter2,0,letter,letter1.length,letter2.length);
            }else if(hasmapping(num1)){
                letter =  map.get(num1).toCharArray();
            }else{
                letter =  map.get(num2).toCharArray();
            }
        }else{
            letter = map.get(digit).toCharArray();
        }
        return letter;
    }

    public boolean hasmapping(int digit){
        if(digit<2){
            return false;
        }
        if(digit>9){
            int num1 = digit%10;
            int num2 = digit/10%10;
            if(num1<2 && num2<2){
                return false;
            }
        }
        return true;
    }
}
