/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order. */

import java.util.Arrays;
import java.util.HashMap;
public class TwoSum {// Hashing
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        
        int[] result = null;
        HashMap<Integer,Integer> map = new HashMap<>(); // complement and index
        for(int i = 0; i < arr.length; i++){
            if (map.containsKey(arr[i])){
                result = new int[] {map.get(arr[i]), i};
                break;
            }
            map.put(target - arr[i], i);
            
        }
        System.out.print(Arrays.toString(result));
    }
}
