package com.marwansalem.maxirail.common.testing;

import org.junit.Assert;

public class AssertUtils {

    public static void assertTrue(String message, boolean condition) {
        Assert.assertTrue(message, condition);
    }

    public static void assertFalse(String message, boolean condition) {
        Assert.assertFalse(message, condition);
    }

    public static void assertEquals(int expected, int actual) {
        Assert.assertEquals(expected, actual);
    }

    public static void assertNotEquals(int unexpected, int actual) {
        Assert.assertNotEquals(unexpected, actual);
    }
}
