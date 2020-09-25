package org.gd.leetcode.p0331;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link Solution}
 *
 * @author Horkhover Dmytro
 * @since 2020-09-25
 */
@DisplayName("LeetCode #331: Verify Preorder Serialization of a Binary Tree")
class SolutionTest {

    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of("1,#", false),
                Arguments.of("9,3,4,#,#,1,#,#,2,#,6,#,#", true),
                Arguments.of("9,#,#,1", false)
        );
    }

    @ParameterizedTest
    @MethodSource("args")
    @DisplayName("IsValidSerialization")
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void test_IsValidSerialization(String preorder, boolean expected) {
        assertEquals(expected, new Solution().isValidSerialization(preorder));
    }
}