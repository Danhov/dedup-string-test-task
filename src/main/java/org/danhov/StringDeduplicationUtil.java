package org.danhov;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringDeduplicationUtil {

    // This class is not designed to be instantiated. It should be used in a static context.
    // By declaring a private constructor, we block this implicit public constructor.
    private StringDeduplicationUtil() {}

    /**
     * Removes duplicate characters from the given input string.
     *
     * @param input the string from which duplicate characters are to be removed (must not be null or empty)
     * @return the modified string with duplicate characters removed
     * @throws IllegalArgumentException if the input is null or empty
     */
    public static String removeDuplicates(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be null or empty");
        }
        input = input.strip();
        StringBuilder stringBuilder = new StringBuilder();

        input.chars()
                .distinct()
                .forEach(c -> stringBuilder.append((char) c));

        return stringBuilder.toString();
    }

    //Alternative solution could be implemented via LinkedHashSet
    public static String removeDuplicatesLinkedHashSet(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be null or empty");
        }
        input = input.strip();
        Set<Character> charSet = new LinkedHashSet<>();

        for (char c : input.toCharArray()) {
            charSet.add(c);
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (char c : charSet) {
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }

}