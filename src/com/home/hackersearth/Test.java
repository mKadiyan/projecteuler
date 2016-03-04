/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED.
 *
 * R8  
 * 
 */

package com.home.hackersearth;

public class Test
{
    public static void main(String[] args)
    {
        doSomething((Object) null);
        doSomething((Integer) null);
        doSomething((char[]) null);
    }

    public static void doSomething(Object obj)
    {
        System.out.println("Object called");
    }
    
    public static void doSomething(char[] obj)
    {
        System.out.println("Array called");
    }




}


/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED
 *
 * R8
 */
