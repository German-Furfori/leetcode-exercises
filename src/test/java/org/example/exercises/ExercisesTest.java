package org.example.exercises;

import org.example.MainTests;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ExercisesTest extends MainTests {

    /**
     * 1. Two Sum
     * https://leetcode.com/problems/two-sum/description/
     * */
    @Test
    public void testTwoSum() {
        this.assertArrayValues(new int[] {0, 1}, Exercises.twoSum(new int[] {2,7,11,15}, 9));
        this.assertArrayValues(new int[] {1, 2}, Exercises.twoSum(new int[] {3,2,4}, 6));
        this.assertArrayValues(new int[] {0, 1}, Exercises.twoSum(new int[] {3,3}, 6));
    }

    /**
     * Repeated String
     * https://www.hackerrank.com/challenges/repeated-string/problem
     * */
    @Test
    public void testRepeatedString() {
        assertEquals(7L, Exercises.repeatedString("aba", 10));
        assertEquals(1000000000000L, Exercises.repeatedString("a", 1000000000000L));
    }

    /**
     * Java Anagram
     * https://www.hackerrank.com/challenges/java-anagrams/problem
     * */
    @Test
    public void testIsAnagram() {
        assertTrue(Exercises.isAnagram("margana", "anagram"));
        assertTrue(Exercises.isAnagram("Hello", "hello"));
        assertFalse(Exercises.isAnagram("marganaa", "anagramm"));
    }

}
