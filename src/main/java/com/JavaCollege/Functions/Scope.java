package com.JavaCollege.Functions;

/*   LOCAL SCOPE ( FUNCTION SCOPE )
     BLOCK SCOPE ( We use { } in another { } and perform an example )
     LOOP SCOPE ( In Loop also you can initialize only new reference variable but can change value of reference varaible used before )
*/

import java.util.Scanner;

public class Scope {
    public static void main(String[] args) {
        int a = 12;//this has now lower priority
        int b = 23;
        int n;
        System.out.println("Enter the number n:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        {
            // int a = 21; cant initialize a new value for same variable that created before itself
            a = 21; // now this got higher priority to change the value
            //but can change value
        }
        System.out.println(a);
        //System.out.println(n); cant access other function method is known as function scope


        //LOOP SCOPE
        for(int i=0;i<=n;i++){
            a = 2;
            System.out.println(a);
            // int a = 10; HERE ALSO WE CANT ASSIGN VARAIBLE BUT CAN CHANGE IT

        }
    }
    static void InitValue(int num){
        int x = 26;
    }


}


