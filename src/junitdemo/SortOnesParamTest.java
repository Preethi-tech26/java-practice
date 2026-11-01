package junitdemo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortOnesParamTest {
    static Stream<Arguments> sortCases() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 0, 1, 1, 0}, new int[]{1, 1, 1, 0, 0, 0}),
                Arguments.of(new int[]{1, 1, 1}, new int[]{1, 1, 1}),
                Arguments.of(new int[]{0, 0, 0}, new int[]{0, 0, 0}),
                Arguments.of(new int[]{}, new int[]{}),
                Arguments.of(new int[]{0}, new int[]{0}),
                Arguments.of(new int[]{1, 0}, new int[]{1, 0}),//sorted array
                Arguments.of(new int[]{0, 1}, new int[]{1, 0}),
                Arguments.of(new int[]{1, 0, 1, 0, 1, 0}, new int[]{1, 1, 1, 0, 0, 0}));
    }

    @ParameterizedTest
    @MethodSource("sortCases")
    void bothMethodsSort(int[] input, int[] expected) {
        int[] a = input.clone();
        int[] b = input.clone();
        Count1and0Array.sortOnesFirst(a);
        SortOnesFirst2.sortOnesFirst2(b);
        assertArrayEquals(expected, a, "count-and-fill");
        assertArrayEquals(expected, b, "two pointers");
    }
}