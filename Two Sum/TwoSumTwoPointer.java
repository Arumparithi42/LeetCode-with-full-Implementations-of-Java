/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order. */

import java.util.Arrays;
public class TwoSumTwoPointer {
    public static void main(String[] args){
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] result = null;

       // Arrays.sort(arr); Sorting can not be done as here they ask indices not values, sorting can alter the indices

        int i = 0, j = arr.length - 1;
        while( i < j){
            if (target > arr[i] + arr[j]){
                i++;
            }
            else if (target < arr[i] + arr[j]){
                j--;
            }
            else{
                result = new int[] {i,j};
                break;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
