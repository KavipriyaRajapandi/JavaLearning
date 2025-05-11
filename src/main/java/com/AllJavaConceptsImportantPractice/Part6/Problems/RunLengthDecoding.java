package com.AllJavaConceptsImportantPractice.Part6.Problems;

public class RunLengthDecoding {
    public static void main(String[] args) {
        String s = "a3b12a2c1";
        char[] a = s.toCharArray();
        String num = "";
        String ch = "";

        for(int i=0;i<a.length-1;i++){
            if(a[i]>='0' && a[i]<='9'){
                num += a[i];
                if(a[i+1]>='a' && a[i+1]<='z'){
                    num += " ";
                }
            }
        }
        if(a[a.length-1]>='0' && a[a.length-1]<='9') {
            num += a[a.length - 1];
        }

        String[] runs = num.split(" ");
        int k = 0;

        for(int i=0;i<a.length;i++){
            if(a[i]>='a' && a[i]<='z'){
                int l = Integer.parseInt(runs[k]);
                for(int j=0;j<l;j++){
                    System.out.print(a[i]+" ");
                }
                System.out.println();
                k++;
            }
        }
    }
}
