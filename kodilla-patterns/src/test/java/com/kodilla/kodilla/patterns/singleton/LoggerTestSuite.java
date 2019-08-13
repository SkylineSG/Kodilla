package com.kodilla.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

Logger logger = new Logger();

    @Test
    public void getLastLog() {
        //Given
    logger.log("Paw");
    logger.log("Wap");
    logger.log("Apw");

        //When
        Logger.getInstance().log("ADS");
        String log = Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals("ADS", log);
    }
}
