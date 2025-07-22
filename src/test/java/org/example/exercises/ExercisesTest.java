package org.example.exercises;

import org.example.MainTests;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
        this.assertIntArrayValuesPrimitive(new int[] {0, 1}, Exercises.twoSum(new int[] {2,7,11,15}, 9));
        this.assertIntArrayValuesPrimitive(new int[] {1, 2}, Exercises.twoSum(new int[] {3,2,4}, 6));
        this.assertIntArrayValuesPrimitive(new int[] {0, 1}, Exercises.twoSum(new int[] {3,3}, 6));
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

    /**
     * Counting Sort 1
     * https://www.hackerrank.com/challenges/countingsort1/problem
     * */
    @Test
    public void testCountingSort() {
        this.assertIntArrayValues(
                new ArrayList<>(List.of(
                        0, 2, 0, 2, 0, 0, 1, 0, 1, 2, 1, 0, 1, 1, 0, 0, 2, 0, 1, 0,
                        1, 2, 1, 1, 1, 3, 0, 2, 0, 0, 2, 0, 3, 3, 1, 0, 0, 0, 0, 2,
                        2, 1, 1, 1, 2, 0, 2, 0, 1, 0, 1, 0, 0, 1, 0, 0, 2, 1, 0, 1,
                        1, 1, 0, 1, 0, 1, 0, 2, 1, 3, 2, 0, 0, 2, 1, 2, 1, 0, 2, 2,
                        1, 2, 1, 2, 1, 1, 2, 2, 0, 3, 2, 1, 1, 0, 1, 1, 1, 0, 2, 2
                )),
                Exercises.countingSort(
                        new ArrayList<>(List.of(
                                63, 25, 73, 1, 98, 73, 56, 84, 86, 57, 16, 83, 8, 25, 81, 56, 9, 53, 98, 67,
                                99, 12, 83, 89, 80, 91, 39, 86, 76, 85, 74, 39, 25, 90, 59, 10, 94, 32, 44, 3,
                                89, 30, 27, 79, 46, 96, 27, 32, 18, 21, 92, 69, 81, 40, 40, 34, 68, 78, 24, 87,
                                42, 69, 23, 41, 78, 22, 6, 90, 99, 89, 50, 30, 20, 1, 43, 3, 70, 95, 33, 46,
                                44, 9, 69, 48, 33, 60, 65, 16, 82, 67, 61, 32, 21, 79, 75, 75, 13, 87, 70, 33
                        ))
                )
        );

        this.assertIntArrayValues(
                new ArrayList<>(List.of(
                        2, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 3, 2, 2, 0, 4, 4, 1, 1,
                        0, 0, 0, 0, 3, 0, 0, 1, 0, 1, 2, 0, 1, 2, 2, 3, 0, 2, 0, 0,
                        1, 0, 1, 1, 0, 0, 1, 1, 0, 2, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1,
                        2, 3, 0, 1, 2, 0, 1, 2, 1, 1, 4, 1, 0, 1, 1, 3, 0, 0, 2, 1,
                        2, 3, 2, 2, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 2, 0, 1, 3, 1, 0
                )),
                Exercises.countingSort(
                        new ArrayList<>(List.of(
                                63, 54, 17, 78, 43, 70, 32, 97, 16, 94, 74, 18, 60, 61, 35, 83, 13, 56, 75, 52,
                                70, 12, 24, 37, 17, 0, 16, 64, 34, 81, 82, 24, 69, 2, 30, 61, 83, 37, 97, 16,
                                70, 53, 0, 61, 12, 17, 97, 67, 33, 30, 49, 70, 11, 40, 67, 94, 84, 60, 35, 58,
                                19, 81, 16, 14, 68, 46, 42, 81, 75, 87, 13, 84, 33, 34, 14, 96, 7, 59, 17, 98,
                                79, 47, 71, 75, 8, 27, 73, 66, 64, 12, 29, 35, 80, 78, 80, 6, 5, 24, 49, 82
                        ))
                )
        );
    }

}
