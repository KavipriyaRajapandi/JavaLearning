package com.Searching.LinearSearch;

public class EvenNumberOfDigits {
    /*
    Input: nums = [12,345,2,6,7896]
    Output: 2
    Explanation:
    12 contains 2 digits (even number of digits).
    345 contains 3 digits (odd number of digits).
    2 contains 1 digit (odd number of digits).
    6 contains 1 digit (odd number of digits).
    7896 contains 4 digits (even number of digits).
    Therefore only 12 and 7896 contain an even number of digits.
     */
        public static void main(String[] args){

            int[] arr = {12,345,2,6,7896};
            //System.out.println(findEvenNumbers(arr));
            System.out.println(findDigits(-534243));

        }
        static int findEvenNumbers(int[] nums) {
            int count = 0;
            for(int num : nums){
                if(even(num)){
                    count++;
                }
            }
            return count;
        }
        static boolean even(int num){
            int evendigits = findDigits(num);
        /*if(evendigits % 2 == 0){
            return true;
        }
        return false;
        */
            return evendigits % 2 == 0;

        }
        static int findDigits(int num){

            //OPTIMIZED SOLUTION

            if(num < 0){
                num = num * -1;
            }

            return (int)(Math.log10(num))+1;

            /*
            //NON OPTIMIZED SOLUTION

            if(num < 0){
                num = num * -1;
            }

            if(num == 0){
                return 1;
            }

            int count = 0;
            while(num > 0){
                count++;
                num /= 10;
            }
            return count;-

             */
        }

    }

