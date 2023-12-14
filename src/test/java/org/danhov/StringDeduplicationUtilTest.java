package org.danhov;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.stream.Stream;

class StringDeduplicationUtilTest {

    @ParameterizedTest
    @MethodSource("inputProvider")
    void testRemoveDuplicates(String input, String expected) {
        String output = StringDeduplicationUtil.removeDuplicates(input);
        assertEquals(expected, output);
    }

    @ParameterizedTest
    @MethodSource("invalidInputsProvider")
    void testRemoveDuplicatesEmptyOrNullExceptions(String input, Class<IllegalArgumentException> expectedException, String expectedMessage) {
        IllegalArgumentException ex = assertThrows(expectedException,
                () -> StringDeduplicationUtil.removeDuplicates(input));
        assertEquals(expectedMessage, ex.getMessage());
    }

    static Stream<Arguments> inputProvider() {
        return Stream.of(
                Arguments.of("aabbbcc", "abc"),
                Arguments.of("a!!a...a???", "a!.?"),
                Arguments.of("ABACC1B2213", "ABC123"),
                Arguments.of("  ABACC1B2213  ", "ABC123")
        );
    }

    static Stream<Arguments> invalidInputsProvider() {
        return Stream.of(
                Arguments.of("", IllegalArgumentException.class, "Input cannot be null or empty"),
                Arguments.of(null, IllegalArgumentException.class, "Input cannot be null or empty")
        );
    }
}