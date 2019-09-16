package org.gd.leetcode.p0448;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link Solution}
 *
 * @since 2019-09-13
 */
class SolutionTest {

    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.arguments(new int[]{4, 3, 2, 7, 8, 2, 3, 1}, List.of(5, 6))
        );
    }

    @ParameterizedTest
    @MethodSource("args")
    @DisplayName("FindDisappearedNumbers")
    void test_FindDisappearedNumbers(int[] input, List<Integer> expected) throws Exception {
        assertEquals(expected, new Solution().findDisappearedNumbers(input));
    }
}