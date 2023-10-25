package com.github.srang.leetcode.p015_three_sum;

import java.util.*;
import java.util.stream.Stream;

public class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> tempSolution = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    tempSolution.add(Stream.of(nums[i], nums[j], nums[k]).sorted().toList());
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return new ArrayList<>(tempSolution);
    }
}
