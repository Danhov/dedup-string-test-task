package org.danhov;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringDeduplicationUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(StringDeduplicationUtil.class.getName());

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
    public static String removeDuplicates(String input) throws IllegalArgumentException {
        input = validateInput(input);

        StringBuilder stringBuilder = new StringBuilder();

        input.chars()
                .distinct()
                .forEach(c -> stringBuilder.append((char) c));

        return stringBuilder.toString();
    }

    //Alternative solution could be implemented via LinkedHashSet
    public static String removeDuplicatesLinkedHashSet(String input) {
        input = validateInput(input);
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

    private static String validateInput(String input) {
        if (input == null || input.isEmpty()) {
            LOGGER.error("Input cannot be null or empty");
            throw new IllegalArgumentException("Input cannot be null or empty");
        }

        input = input.strip();
        return input;
    }

}