package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LoggerTestSuite {
    private static Logger logger;

    @Test
    void testGetLastLog(){
        //Given
        logger = Logger.INSTANCE;

        //When
        logger.log("log1");
        logger.log("log2");
        String log = logger.getLastLog();

        //Then
        assertEquals("log2", log);
    }
}