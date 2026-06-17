/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order. */

import java.util.Arrays;

public class TwoSumNaive{
    public static void main(String[] args){
        int[] arr = {2,7,11,15};
        int target = 9;

        int l = arr.length;
        int[] result = null;

        search:
        for(int i = 0; i < l - 1; i++){
            for(int j = i + 1; j < l; j++){
                if (target == arr[i] + arr[j]){
                    result = new int[] {i, j};
                    break search;
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}