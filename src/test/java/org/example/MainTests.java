package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.junit.Assert.assertEquals;

public abstract class MainTests {

    protected void assertArrayValues(int[] expected, int[] actual) {
        List<Integer> expectedList = new ArrayList<>();
        List<Integer> actualList = new ArrayList<>();
        for (int i : expected) expectedList.add(i);
        for (int i : actual) actualList.add(i);
        Collections.sort(expectedList);
        Collections.sort(actualList);
        assertEquals(expectedList, actualList);
    }

}
