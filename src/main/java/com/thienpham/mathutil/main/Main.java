
package com.thienpham.mathutil.main;

import com.thienpham.mathutil.core.MathUtil;

public class Main {
    public static void main(String[] args) {
        
        
        long expected  = 120;
        int n = 5;
        long actual = MathUtil.getFactorial(n);
        
   
        System.out.println("5! = " + expected + " expected" );
        System.out.println("5! = " + actual + " actual" );
        
    }
}
