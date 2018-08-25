package com.sel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OneTest {
    @Test
    public void testConcatAndConvertString() throws Exception {
        String expectedValue="HELLOWORLD";
        OneTest app=new OneTest();
        String actualValue = app.concatAndConvertString("Hello", "World");
        assertEquals(expectedValue, actualValue);
    }
}