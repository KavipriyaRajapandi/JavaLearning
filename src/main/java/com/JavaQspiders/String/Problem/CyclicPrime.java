package com.JavaQspiders.String.Problem;

public class CyclicPrime {
    public static void main(String[] args) {
            String s = "1193";
             int k = s.length();
            char[] a = s.toCharArray();
            boolean[] res = shifting(a);
            boolean flag = false;

            for(int i=0;i<res.length;i++){
                if(res[i]==true){
                    flag = true;
                }
                else{
                    flag = false;
                }
            }
            if(flag){
                System.out.println("Cyclic Prime");
            }
            else{
                System.out.println("Not a Cyclic Prime");
            }
    }
    public static boolean[] shifting(char[] a){
        boolean[] seen = new boolean[a.length];
        int x = 0;
        String ans = "";
        for(int m=1;m<=a.length;m++){
            if(m==1) {
                ans = new String(a);
                int ans1 = Integer.parseInt(ans);
                if (checkitsPrime(ans1)) {
                    seen[x] = true;
                    x++;
                }
            }
            else {
                    int start = a[0];
                    for (int i = 0; i < a.length - 1; i++) {
                        a[i] = a[i + 1];
                    }
                    a[a.length - 1] = (char) start;
                    ans = new String(a);
                    int ans2 = Integer.parseInt(ans);

                    if(checkitsPrime(ans2)){
                        seen[x] = true;
                        x++;
                    }

            }
        }

        return seen;
    }
    public static boolean checkitsPrime(int a){
        if(a==0||a==1){
            return false;
        }
        for(int i=2;i<a;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}
