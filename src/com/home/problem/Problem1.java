/*
 * Copyright (c) Siemens AG 2015 ALL RIGHTS RESERVED.
 *
 * R8  
 * 
 */

package com.home.problem;

import java.math.BigInteger;

/**
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 * Answer:233168
 * 
 */
public class Problem1
{
    public static void main(String[] args)
    {
        /*
         * use formula number*n*(n-1)/2
         */
        // int N = 999;
        // int threeNumbers = 3 * (N / 3) * (N / 3 + 1) / 2;
        // int fiveNumbers = 5 * (N / 5) * (N / 5 + 1) / 2;
        // int fifteenNumbers = 15 * (N / 15) * (N / 15 + 1) / 2;
        // System.out.println("Sum is : " + (threeNumbers + fiveNumbers - fifteenNumbers));
        
        int integ = 25;
        BigInteger result = new BigInteger("1");
        while (integ > 0)
        {
            result = result.multiply(new BigInteger(integ + ""));
            integ--;
        }
        System.out.println(result);

    }
}


/*
 * Copyright (c) Siemens AG 2015 ALL RIGHTS RESERVED
 *
 * R8
 */
