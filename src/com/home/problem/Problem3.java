/*
 * Copyright (c) Mehar  2015 ALL RIGHTS RESERVED.
 *
 * 
 */

package com.home.problem;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143 ?
 *
 */
public class Problem3
{
    public static void main(String[] args)
    {
        new Problem3().mySolution();
    }
    
    private void mySolution()
    {
        long number = 51L;
        long lastFactor;
        long maxFactor;
        long factor = 2;
        if (number % 2 == 0)
        {
            lastFactor = 2;
            number = number / 2;
            while (number % 2 == 0)
            {
                number = number / 2;
            }
        }
        else
            lastFactor = 1;
        factor = 3;
        maxFactor = (long) Math.sqrt(number);
        while (number > 1 && factor <= maxFactor)
        {
            if (number % factor == 0)
            {
                lastFactor = factor;
                while (number % factor == 0)
                {
                    number = number / factor;
                    
                }
                maxFactor = (long) Math.sqrt(number);
            }
            factor = factor + 2;
        }
        
        if (number == 1)
            System.out.println(lastFactor);
        else
            System.out.println(number);
        
    }
    
}

/*
 * Copyright (c) Mehar 2015 ALL RIGHTS RESERVED
 */
