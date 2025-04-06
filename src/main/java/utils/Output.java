package src.main.java.utils;

import java.util.logging.Logger;

public class Output {

    private static final Logger logger = Logger.getLogger("Output");

    public static <T> void printElementsInArray(T[] arr) {
        logger.info("Printing Elements In Array: ");
        for(T t : arr) {
            System.out.println(t);
        }
    }
}
