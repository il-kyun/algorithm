package com.leetcode;

import java.util.*;

/**
 * Created by IK on 2017-06-25.
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        Arrays.sort(nums);

        int sum = 0;
        int[] arr = null;

        Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();

        for(int i=0; i <= nums.length -1 ; i++){
            for(int j=i+1; j <= nums.length -1 ; j++){
                for(int k=j+1; k <= nums.length -1 ; k++){
                    for(int l=k+1; l <= nums.length -1 ; l++){
                        if( nums[i] + nums[j] + nums[k] + nums[l] == target){
                            arr = new int[4];
                            arr[0] = nums[i];
                            arr[1] = nums[j];
                            arr[2] = nums[k];
                            arr[3] = nums[l];


                             Arrays.sort(arr);
                             String key = Arrays.toString(arr);
                            if( !map.containsKey(key) ){
                                List<Integer> integers = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                                map.put(key,integers );
                            }

                        }

                    }
                }
            }
        }
        for( List<Integer> lll : map.values()){
            result.add(lll);
        }
        return result;
    }
}
