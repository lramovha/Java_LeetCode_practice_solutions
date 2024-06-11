import java.io.*;
import java.util.*;

class FindMedianSorted {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        
        int[] mergedArray = new int[m + n];
        int i=0, j=0, k=0;

        while(i < m && j < n){
            if (nums1[i] < nums2[j]){
                mergedArray[k++] = nums1[i++];
            }
            else{
                mergedArray[k++] = nums2[j++];
            }
        }

        while (i < m){
            mergedArray[k++] = nums1[i++];
        }

        while (j < n) {
            mergedArray[k++] = nums2[j++];
        }

        int totalLength = m + n;
        if (totalLength % 2 == 0) {
            return (mergedArray[totalLength / 2 - 1] + mergedArray[totalLength / 2]) / 2.0;
        } else {
            return mergedArray[totalLength / 2];
        }
    }

    public static void main(String [] args){

    }
}