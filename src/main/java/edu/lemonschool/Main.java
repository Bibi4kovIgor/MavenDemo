package edu.lemonschool;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger("Some class output");

    public static void main(String[] args) {
        Marker marker = MarkerFactory.getMarker("Some marker:");
        logger.info(marker, "Some log");
    }
}