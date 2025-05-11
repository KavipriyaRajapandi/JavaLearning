package com.AllJavaConceptsImportantPractice.Part4.InterviewBasedQuestions;
//it bases on binary search algorithm
//Order of Elements will increase and then decrease at one point we go for last max value
public class FindthePeak {
    public static void main(String[] args) {
        int[] a = {1,2,3,6,6,6,6,6,6,6,9,7,3,2,1};

        System.out.println(findPeakValue(a,0,a.length-1));
    }
    public static int findPeakValue(int[] a,int left,int right){
        if(a.length==0){
            return -1;
        }
        if(left>right){
            return -1;
        }
        if(a.length==1){
            return a[left];
        }
        if(a.length==2){
            return a[left]>=a[right] ? a[left] : a[right];
        }
        int mid = (left+right)/2;

        if(a[mid]>a[mid+1] && a[mid]>a[mid-1]){ //if middle is greater than nearby left and right return the middle
            return a[mid];
        }

        int output = -1;

        if(a[mid-1]>a[mid]){ // if left middle is greater than middle go for again reducing the array
            output = findPeakValue(a,left,mid-1);
        }
        else if(a[mid+1]>a[mid]){ // if right middle is greater than middle go for again reducing the array
            output = findPeakValue(a,mid+1,right);
        }
        else{
            //if both near middle left and right value are equal we go for else statement
            int rightPeak = findPeakValue(a,mid+1,right);
            int leftPeek = findPeakValue(a,left,mid-1);

            if(rightPeak>output){
                output = rightPeak;
            }
            if(leftPeek>output){
                output = leftPeek;
            }
        }
        return output;
    }
}
