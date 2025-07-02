package org.example.exercises;

import org.example.MainTests;
import org.junit.Test;

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

}
