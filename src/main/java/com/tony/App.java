package com.tony;

import com.tony.util.SystemUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        String str=System.getProperty("java.library.path");
//        System.out.println(str);
        try {
            SystemUtil.memory();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
