package org.example.exercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Exercises {

    /**
     * 1. Two Sum
     * https://leetcode.com/problems/two-sum/description/
     * */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> result = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (result.containsKey(target - nums[i])) {
                return new int[] {i, result.get(target - nums[i])};
            }
            result.put(nums[i], i);
        }

        return new int[] {};
    }

    /**
     * Repeated String
     * https://www.hackerrank.com/challenges/repeated-string/problem
     * */
    public static long repeatedString(String s, long n) {
        long repeats = n / s.length();
        long module = n % s.length();
        long count = 0;
        long total = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') count += 1;
        }

        total = repeats * count;

        for (int i = 0; i < module; i++) {
            if (s.charAt(i) == 'a') total++;
        }

        return total;
    }

    /**
     * Java Anagram
     * https://www.hackerrank.com/challenges/java-anagrams/problem
     * */
    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        char[] first = a.toLowerCase().toCharArray();
        char[] second = b.toLowerCase().toCharArray();

        java.util.Arrays.sort(first);
        java.util.Arrays.sort(second);

        String a1 = new String(first);
        String b1 = new String(second);

        for (int i = 0; i < a.length(); i++) {
            if (a1.charAt(i) != b1.charAt(i)) return false;
        }

        return true;
    }

}
