package com.AllJavaConceptsImportantPractice.Part6.StringInterviewQuestions;

class ValidGmail {
    public static void main(String[] args) {
        String s = "qspjsp123@gmail.com";
        char[] arr = s.toCharArray();
        boolean[] seen = new boolean[255];
        String left = "";
        String right =  "";
        boolean res = valid(s,arr,seen,left,right);
        if(res){
            System.out.print("Valid Gmail");
        }
        else{
            System.out.print("Not Valid Gmail");
        }
    }
    public static boolean valid(String s,char[]a,boolean[] seen,String l, String r){
        int left  = 0;
        int right = a.length;
        int leftend = 0;
        int rightend = 0;
        //condition to check first and last char are not @
        if(a[0]=='@' || a[a.length-1]=='@'){
            return false;
        }
        //conditon to check if @ present 2 times in given string (if 2 times present not valid)
        for(int i=0;i<a.length;i++){
            if(a[i]=='@'){
                if(seen['@']){
                    return false;
                }
                seen['@'] = true;
                //check if there is char or integer on left side of @
                if((a[i-1]>='a' && a[i-1]<='z') || (a[i-1]>='0' && a[i-1]<='9')){
                    leftend = i;
                }
                else{
                    return false;
                }
                //check if there is g char after right side of @
                if(a[i+1]=='g'){
                    rightend = i+1;
                }
                else{
                    return false;
                }
            }
        }

        l = s.substring(left,leftend);
        r = s.substring(rightend,right);

        char[] checkLeft = l.toCharArray();
        char[] checkRight = r.toCharArray();

        for(int i=0;i<checkLeft.length-1;i++){
            if(a[0]>='A' && a[0]<='Z'){
                return false;
            }
            if((a[i]>='0' && a[i]<='9') || (a[i]>='a' && a[i]<='z') || (a[i+1]>='A' && a[i+1]<='Z')){
            }
            else{
                return false;
            }
        }

        String ip1 = "gmail";
        String ip2 = "com";
        int newEndLeft = 0;
        int newEndRight = 0;
        int rr = checkRight.length;

        for(int i=0;i<checkRight.length;i++){
            if(checkRight[i]=='.'){
                if(seen['.']){
                    return false;
                }
                seen['.'] = true;
                if(checkRight[i-1]=='l'){
                    newEndLeft = i;
                }
                else{
                    return false;
                }
                //check if there is g char after right side of @
                if(checkRight[i+1]=='c'){
                    newEndRight = i + 1;
                }
                else{
                    return false;
                }
            }
        }
        String s1 = "";
        String s2 = "";

        s1 = r.substring(left,newEndLeft);
        s2 = r.substring(newEndRight,rr);

        if(s1.equals(ip1) && s2.equals(ip2)){
            return true;
        }
        return false;
    }
}
