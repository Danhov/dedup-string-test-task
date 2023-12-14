package org.danhov;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    public static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        try {
            if (args.length > 0) {
                String input = args[0];
                String output = StringDeduplicationUtil.removeDuplicates(input);
                LOGGER.info(output);
            } else {
                LOGGER.warn("Please provide an input string as a command-line argument.");
            }
        } catch (IllegalArgumentException ex) {
            LOGGER.error("An error occurred: {}", ex.getMessage());
        } catch (Exception ex) {
            LOGGER.error("An unexpected error occurred: {}", ex.getMessage());
        }
    }
}