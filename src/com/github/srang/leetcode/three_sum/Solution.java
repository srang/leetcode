package com.github.srang.leetcode.three_sum;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> tempSolution = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                for(int k = 0; k < nums.length; k++) {
                    if (i != j && i != k && j != k
                            && nums[i] + nums[j] + nums[k] == 0) {
                        tempSolution.add(Stream.of(nums[i], nums[j], nums[k]).sorted().toList());
                    }
                }
            }
        }
        return new ArrayList<>(tempSolution);
    }
}
