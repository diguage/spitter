package com.diguage.books.spitter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * <p/>
 * Coder：D瓜哥，http://www.diguage.com/
 * <p/>
 * Date: 2014-07-25 21:51
 */
public class HelloWorldTest {
    @Test
    public void testSayHello() {
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.sayHello();
        assertEquals("Hello D瓜哥！", result);
    }
}
