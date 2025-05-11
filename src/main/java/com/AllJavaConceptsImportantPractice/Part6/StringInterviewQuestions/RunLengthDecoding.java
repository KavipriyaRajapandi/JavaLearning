package com.AllJavaConceptsImportantPractice.Part6.StringInterviewQuestions;

public class RunLengthDecoding {
    public static void main(String[] args) {
        String a = "a2b10c3";
        String num = "";
        String res = "";

        char[] arr = a.toCharArray();
        //[a,2,b,1,0,c,3]
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>='0' && arr[i]<='9'){
                num += arr[i];
                if(arr[i+1]>='a' && arr[i+1]<='z'){
                    num += " ";
                }
            }
        }
        if(arr[arr.length-1]>='0' && arr[arr.length-1]<='9'){
            num += arr[arr.length-1];
        }

        String[] s = num.split(" ");
        int k = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>='a' && arr[i]<='z'){
                int l = Integer.parseInt(s[k]);
                for(int j=0;j<l;j++){
                    res += arr[i]+" ";
                }

                System.out.print("\n");
                k++;
            }

        }



    }
}
