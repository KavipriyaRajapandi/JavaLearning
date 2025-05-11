package com.JavaCollege.ConceptProgram;
import java.util.*;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;

        while(true){
            System.out.print("Enter the operator:");
            char op = sc.next().trim().charAt(0);
            //until the user give the x or X operator the program continous else it shows invalid character when u give wrong operator
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // represent the numbers needed to do the operation with user input access
                System.out.print("Enter the numbers to perform operation:");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-'){
                    ans = num1 - num2;
                }
                if (op == '*'){
                    ans = num1 * num2;
                }
                if (op == '/'){
                    if(num2 != 0){
                        ans = num1 / num2;
                    }
                }
                if (op == '%'){
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            }
            else{
                System.out.println("Invalid operator!!");
            }

            System.out.println(ans);
        }

    }
}
