package org.example.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
        HashMap<Character, Integer> aMap = new HashMap<>();
        HashMap<Character, Integer> bMap = new HashMap<>();

        for (char c : a.toLowerCase().toCharArray()) {
            aMap.put(c, aMap.getOrDefault(c, 0) + 1);
        }

        for (char c : b.toLowerCase().toCharArray()) {
            bMap.put(c, bMap.getOrDefault(c, 0) + 1);
        }

        return aMap.equals(bMap);
    }

    /**
     * Counting Sort 1
     * https://www.hackerrank.com/challenges/countingsort1/problem
     * */
    public static List<Integer> countingSort(List<Integer> arr) {
        int[] result = new int[100];

        for (Integer num : arr) {
            result[num] = result[num] + 1;
        }

        return Arrays.stream(result).boxed().collect(Collectors.toList());
    }

    /**
     * Missing Numbers
     * https://www.hackerrank.com/challenges/missing-numbers/problem
     * */
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        HashMap<Integer, Integer> arrMap = new HashMap<>();
        HashMap<Integer, Integer> brrMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (Integer num : arr) {
            arrMap.put(num, arrMap.getOrDefault(num, 0) + 1);
        }

        for (Integer num : brr) {
            brrMap.put(num, brrMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : brrMap.entrySet()) {
            if (!arrMap.containsKey(entry.getKey()) ||
                    !arrMap.get(entry.getKey()).equals(entry.getValue())) result.add(entry.getKey());
        }

        Collections.sort(result);

        return result;
    }

}
