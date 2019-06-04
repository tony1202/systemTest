package com.tony;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        String property = System.getProperty("java.library.path");
        System.out.println("【java.library.path路径】 -->" + property);

    }
}
