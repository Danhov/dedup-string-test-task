package org.danhov;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger(App.class);

        if (args.length > 0) {
            String input = args[0];
            String output = StringDeduplicationUtil.removeDuplicates(input);
            logger.info(output);
        } else {
            logger.warn("Please provide an input string as a command-line argument.");
        }
    }
}