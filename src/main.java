/*
 * Copyright (C) 2013 - Vladimir Jimenez
 * License: MIT
 */

package main;

public class main
{
    public static void main (String args[])
    {
        Polynomial myPolynomial = new Polynomial("-100x^(10) -2x^(4) - 10x^(3) + x^(2) + 9");
        Polynomial mySecondPolynomial = new Polynomial("3x^(6) + 4x^(4) + 10x^(3) + 2x^(2) + 19");

       System.out.println("1st polynomial is=");
        // Output: -100x^(10) - 2x^(4) - 10x^(3) + x^(2) + 9
        System.out.println(myPolynomial);
        System.out.println("2nd polynomial is=");
        // Output: 3x^(6) + 4x^(4) + 10x^(3) + 2x^(2) + 19
        System.out.println(mySecondPolynomial);
        System.out.println("Addition of these 2 polynomials=");
        // Output: -100x^(10) + 3x^(6) + 2x^(4) + 3x^(2) + 28
        System.out.println(myPolynomial.add(mySecondPolynomial));
        System.out.println("Substraction of these 2 polynomials=");
        System.out.println(myPolynomial.sub(mySecondPolynomial));
        System.out.println("multipication of these 2 polynomials=");
        // Output: -300x^(16) - 400x^(14) - 1000x^(13) - 200x^(12) - 1906x^(10) - 30x^(9) - 5x^(8) - 60x^(7) - 73x^(6) - 10x^(5) - 100x^(3) + 37x^(2) + 171
        System.out.println(myPolynomial.multiply(mySecondPolynomial).simplify());
    }
}
