package LeetCode.Problems.Easy;
//Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).
//
//The algorithm for myAtoi(string s) is as follows:
//
//Read in and ignore any leading whitespace.
//Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
//Read in next the characters until the next non-digit charcter or the end of the input is reached. The rest of the string is ignored.
//Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
//If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
//Return the integer as the final result.
//Note:
//
//Only the space character ' ' is considered a whitespace character.
//Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.
public class Atoi {
    public static void main(String[] args) {
        System.out.println(myAtoi("+-42"));
    }

    public static int myAtoi (String s){
        boolean  start =false;
        int sign=1;
        long value =0;
        boolean minMax=false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch == ' ' || Character.isDigit(ch) || ch=='-' ||ch=='+'){
                if(!start){
                    if(ch=='-'){
                        sign=-1;
                        start=true;
                    }
                    else if(ch=='+') {
                        sign=1;
                        start=true;
                    }
                    else if(Character.isDigit(ch)){
                        start=true;
                        value =Character.getNumericValue(ch);
                    }
                }
                else if (Character.isDigit(ch)) {
                    value = value*10+Character.getNumericValue(ch);
                }
                else {
                    break;
                }

                if(Integer.MAX_VALUE < value * sign){
                    value=Integer.MAX_VALUE;
                    minMax=true;
                    break;
                }
                else if(Integer.MIN_VALUE > value*sign){
                    value= Integer.MIN_VALUE;
                    minMax=true;
                    break;
                }
            }
            else{
                break;
            }
        }

        return minMax?(int)value:(int)value*sign;
    }
}
